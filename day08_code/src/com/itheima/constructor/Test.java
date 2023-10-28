package com.itheima.constructor;

public class Test {
    public static void main(String[] args) {
        Student1 c1 = new Student1();
        System.out.println(c1);
        System.out.println(c1.name);
        Student1 c2 = new Student1("张三", 18);
        System.out.println(c2.getAge());
        c2.setAge(5);
        System.out.println(c2.getAge());
    }
}
