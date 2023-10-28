package com.itheima.Oopdemo4;

public class Test {
    public static void main(String[] args) {
        Student4 s1 = new Student4();
        System.out.println(s1.getAge() + " " + s1.getName());
        s1.setAge(14);
        s1.setName("李四");
        System.out.println(s1.getAge() + " " + s1.getName());
        Student4 s2 = new Student4("张三", 18);
        System.out.println(s2.getAge() + " " + s2.getName());

    }
}
