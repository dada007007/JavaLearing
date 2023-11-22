package com.itheima.d10_reflect;

public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：掌握反射第一步：加载类，得到类的Class对象。
        // 1、类名.class
        Class c1 = Student.class;
        System.out.println(c1);

        // 2、public static Class forName(全类名)
        Class c2 = Class.forName("com.itheima.d10_reflect.Student");
        System.out.println(c2);

        // 3、对象.getClass()方法获取Class对象
//        Student s1 = new Student();
//        Class c3 = s1.getClass();
//        System.out.println(c3);
//        System.out.println(c3 == c1);

        System.out.println(c1.getName()); // 全类名  com.itheima.d10_reflect.Student
        System.out.println(c1.getSimpleName()); // 简名 Student
    }
}
