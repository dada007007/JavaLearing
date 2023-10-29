package com.itheima.d1_staticdemo;

public class Test {
    public static void main(String[] args) {
        Student.name = "元华";
        System.out.println(Student.name);

        Student s1 = new Student();
        s1.name = "马冬梅";
        Student s2 = new Student();
        s2.name = "秋雅";
        System.out.println(s1.name);
        System.out.println(s2.name);

    }
}
