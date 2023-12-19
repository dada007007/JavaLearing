package com.itheima.aop;

import com.itheima.mapper.OperateLogMapper;
import com.itheima.pojo.OperateLog;
import com.itheima.util.JwtUtils;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * 记录系统的操作日志
 */
@Slf4j
@Component
@Aspect
public class OperateLogAspect {
    @Autowired
    private OperateLogMapper operateLogMapper;
    @Autowired
    private HttpServletRequest request;//springboot底层自动配置

    @Around("@annotation(com.itheima.anno.Login)")
    public Object recordLog(ProceedingJoinPoint pjp) throws Throwable {
        //获取操作人的ID -- 当前登录员工的ID ---> 从令牌token中获取 ---> 请求头token ---> request.getHeader("token")
        Integer operateEmpId = (Integer) (JwtUtils.parseJWT(request.getHeader("token")).get("id"));
        //操作时间
        LocalDateTime operateTime = LocalDateTime.now();
        //类名
        String className = pjp.getTarget().getClass().getName();
        //方法
        String methodName = pjp.getSignature().getName();
        //方法运行的参数
        Object[] args = pjp.getArgs();
        String methodParams = Arrays.toString(args);
        //返回值
        long begin = System.currentTimeMillis();
        Object result = pjp.proceed();
        long end = System.currentTimeMillis();
        OperateLog operateLog = new OperateLog(null,operateEmpId,operateTime,className,methodName,methodParams,result.toString(),end-begin,null);
        //最终，将日志记录到数据库表中 operate_log
        operateLogMapper.insert(operateLog);
        return result;

    }
}
