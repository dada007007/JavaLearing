package com.itheima.aop;


import com.itheima.mapper.LoginLogMapper;
import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpLoginLog;
import com.itheima.pojo.LogInfo;
import com.itheima.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 系统中所有员工的登录操作
 */
@Slf4j
@Component
@Aspect
public class LoginLogAspect {
    @Autowired
    private LoginLogMapper loginLogMapper;

    @Around("execution(* com.itheima.controller.LoginController.login(..))")
    public Object recordLog(ProceedingJoinPoint pjp) throws Throwable {
        //用户名在原始方法执行时的参数中:方法运行的参数
        Object[] args = pjp.getArgs();
        Emp emp = (Emp) args[0];
        String username = emp.getUsername();
        //密码在原始方法执行时的参数中
        String password = emp.getPassword();
        //登录时间
        LocalDateTime loginTime = LocalDateTime.now();
        //方法执行前记录次时间
        long begin = System.currentTimeMillis();
        //返回值
        Object result = pjp.proceed();
        //方法执行后记录次时间
        long end = System.currentTimeMillis();
        //返回值转型
        Result result1 = (Result) result;
        //获取返回值中的code即成功与否
        int code = result1.getCode();
        Short isSuccess = (short) code;
        Object data = result1.getData();
        //获取jwt
        String jwt = "";
        if (data != null) {
            LogInfo logInfo = (LogInfo) data;
            jwt = logInfo.getToken();
        } else {
            jwt = null;
        }
        //方法消耗时间
        Long costTime = end - begin;
        //新建对象，注入进去
        EmpLoginLog loginLog = new EmpLoginLog(null, username, password, loginTime, isSuccess, jwt, costTime);
        //最终，将日志记录到数据库表中 operate_log
        loginLogMapper.insert(loginLog);
        return result;
    }
}
