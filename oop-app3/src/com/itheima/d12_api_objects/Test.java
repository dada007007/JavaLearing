package com.itheima.d12_api_objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        // 目标：掌握Objects类提供的常用方法

        String s1 = null;//如果是s1为空对象，则String类下的equals方法做的内容比较就会出错
        String s2 = "itheima";

//        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1, s2)); //更安全 更好

        System.out.println(Objects.isNull(s1));// true  源码就是 == null
        System.out.println(s1 == null);// true

        System.out.println(Objects.isNull(s2));// false

        System.out.println(Objects.nonNull(s2));// true
        System.out.println(Objects.nonNull(s1));// false


    }
}
