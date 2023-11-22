package com.itheima.d10_reflect;

import java.lang.reflect.Constructor;

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        // 目标：反射-获取构造器对象并操作。
        // 1、反射第一步：加载类，获取类的Class对象
        Class c = Student.class;

        // 2、获取类中的构造器对象
         Constructor[] constructor = c.getConstructors(); // 只拿public的
        Constructor[] constructors = c.getDeclaredConstructors(); // 只要你敢写，我就敢拿
        for (Constructor con : constructors) {
            System.out.println(con.getName() + " ---> " + con.getParameterCount());
        }

        // 3、需要定位单个构造器:根据参数类型匹配
        // 反射是可以绕过Java的封装约束的！
        Constructor con1 = c.getDeclaredConstructor(); // 无参数构造器
        Constructor con2 = c.getDeclaredConstructor(String.class, char.class); // 两个参数构造器

        con1.setAccessible(true); // 禁止检查该构造器的访问权限（暴力权限）
        Student s1 = (Student) con1.newInstance();
        System.out.println(s1);

        con2.setAccessible(true); // 禁止检查该构造器的访问权限（暴力权限）
        Student s2 = (Student) con2.newInstance("二狗子", '男');
        System.out.println(s2);
    }
}
