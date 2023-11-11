package com.itheima.d1_object;

import com.itheima.d1_object.Student;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("文龙",22,'男');
        Student s2 = new Student("文龙",22,'男');
        System.out.println(s1.toString());

        System.out.println(s1.equals(s2));


    }
}
