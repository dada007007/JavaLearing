package com.itheima.aop;

import com.itheima.anno.Log;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
//@Component
//@Aspect
@Order(2)
public class MyAspect2 {
    //前置通知
    //@Before("execution(public void com.itheima.service.impl.DeptServiceImpl.delete(java.lang.Integer))")
    //@Before("execution(void com.itheima.service.impl.DeptServiceImpl.delete(java.lang.Integer))")
    //@Before("execution(void com.itheima.service.impl.DeptServiceImpl.delete(*))")
    //@Before("execution(* com.itheima.service.impl.DeptServiceImpl.*(..))")
    //@Before("execution(* com.itheima.service.impl.DeptServiceImpl.*(..))")
    //@Before("execution(* com.itheima.service.impl.DeptServiceImpl.del*(..))")

//    @Before("execution(* com.itheima.service.impl.DeptServiceImpl.list())" +
//            "execution(* com.itheima.service.impl.DeptServiceImpl.save(..))")

    @Before("@annotation(com.itheima.anno.Log)")
    public void before(){
        log.info("MyAspect2 -> before ...");
    }

    //后置通知
    @After("execution(* com.itheima.service.impl.DeptServiceImpl.*(..))")
    public void after(){
        log.info("MyAspect2 -> after ...");
    }
}
