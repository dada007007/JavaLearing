package com.itheima.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Component
@Aspect
@Order(1)//@Order注解的value值越小，前置通知的优先级越高
public class MyAspect5 {
    //前置通知
    @Before("execution(* com.itheima.service.impl.DeptServiceImpl.*(..))")
    public void before(JoinPoint joinPoint){
        log.info("MyAspect5 -> before ...");

        //1、获取目标类的类名
        log.info("目标类的类名:{}",joinPoint.getTarget().getClass().toString());
        log.info("目标类的增强后的类名（代理）:{}",joinPoint.getThis().getClass().toString());

        //2、获取目标方法签名
        log.info("原始方法的签名：{}",joinPoint.getSignature().toString());

        //3、获取方法名
        log.info("获取方法名：{}",joinPoint.getSignature().getName());

        //4、获取方法运行时的参数
        log.info("获取方法运行时的参数：{}", Arrays.toString(joinPoint.getArgs()));

    }
    @Around("execution(* com.itheima.service.impl.DeptServiceImpl.*(..))")
    public Object getResult(ProceedingJoinPoint pjp) throws Throwable {
        log.info("MyAspect1 ... around before...");
        Object result = pjp.proceed();
        //1、获取目标类的类名
        log.info("目标类的类名:{}",pjp.getTarget().getClass().toString());
        log.info("目标类的增强后的类名（代理）:{}",pjp.getThis().getClass().toString());

        //2、获取目标方法签名
        log.info("原始方法的签名：{}",pjp.getSignature().toString());

        //3、获取方法名
        log.info("获取方法名：{}",pjp.getSignature().getName());

        //4、获取方法运行时的参数
        log.info("获取方法运行时的参数：{}", Arrays.toString(pjp.getArgs()));

        log.info("MyAspect1 ... around after...");
        return result;
    }


}
