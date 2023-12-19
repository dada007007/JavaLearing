package com.itheima.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * AOP程序
 */
//@Aspect //标注当前类是一个切面类
//@Component
@Slf4j
public class TimeAspect {
    @Around("execution(* com.itheima.service.impl.DeptServiceImpl.*(..))")
    //切入点表达式 --> 就是来描述当前AOP程序针对于哪些方法切入
    public Object getResult(ProceedingJoinPoint pjp) throws Throwable {

        //1、获取开始时间
        long begin = System.currentTimeMillis();

        //2、调用原始方法运行 -- Object类型的返回值 ， 就是原始方法运行的返回值
        Object result = pjp.proceed();

        //3、获取结束时间
        long end = System.currentTimeMillis();
        log.info("方法执行时间，{}", end - begin);
        return result;


    }


}
