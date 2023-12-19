package com.itheima.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
@Slf4j
public class MyAspect1 {
    @Pointcut("execution(* com.itheima.service.impl.DeptServiceImpl.*(..))")
    private void pt(){}

    @Before("pt()")
    public void before(){
        log.info("MyAspect1 ... before...");
    }

/*    @Around("execution(* com.itheima.service.impl.DeptServiceImpl.*(..))")
    public Object getResult(ProceedingJoinPoint pjp) throws Throwable {
        log.info("MyAspect1 ... around before...");
        Object result = pjp.proceed();

        log.info("MyAspect1 ... around after...");
        return result;
    }
*/

    @Around("pt()")
    public Object getResult(ProceedingJoinPoint pjp) throws Throwable {
        log.info("MyAspect1 ... around before...");
        Object result = pjp.proceed();

        log.info("MyAspect1 ... around after...");
        return result;
    }

    @After("pt()")
    public void after(){
        log.info("MyAspect1 ... after...");
    }

    @AfterReturning("pt()")
    public void afterReturning(){
        log.info("MyAspect1 ... afterReturning...");
    }

    @AfterThrowing("pt()")
    public void afterThrowing(){
        log.info("MyAspect1 ... afterThrowing...");
    }
}
