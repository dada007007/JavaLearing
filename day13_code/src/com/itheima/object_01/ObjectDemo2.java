package com.itheima.object_01;

import java.util.Objects;

public class ObjectDemo2 {
    public static void main(String[] args) {
        Student stu1 = new Student("艾克",19);
        Student stu2 = new Student("艾克",19);
        System.out.println(stu1.equals(stu2));
    }


}
