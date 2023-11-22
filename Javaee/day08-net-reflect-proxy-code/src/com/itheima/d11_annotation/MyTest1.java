package com.itheima.d11_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD}) // 只能注解类
@Retention(RetentionPolicy.RUNTIME) // 声明注解的保留周期
public @interface MyTest1 {
}
