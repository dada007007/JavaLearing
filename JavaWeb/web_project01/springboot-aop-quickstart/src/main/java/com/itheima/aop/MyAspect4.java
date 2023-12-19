package com.itheima.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
//@Component
//@Aspect
@Order(1)//@Order注解的value值越小，前置通知的优先级越高
public class MyAspect4 {
    //前置通知
    @Before("execution(* com.itheima.service.impl.DeptServiceImpl.*(..))")
    public void before(){
        log.info("MyAspect4 -> before ...");
    }

    //后置通知
    @After("execution(* com.itheima.service.impl.DeptServiceImpl.*(..))")
    public void after(){
        log.info("MyAspect4 -> after ...");
    }
}
