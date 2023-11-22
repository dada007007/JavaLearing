package com.itheima.d11_annotation;
// 自定义注解。
public @interface Book {
     String name();
     double price() default 9.9;
     String[] authors();
}
