package com.itheima.extends05_test;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);
        s.setSkill("打篮球");
        System.out.println(s.getSkill());
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
