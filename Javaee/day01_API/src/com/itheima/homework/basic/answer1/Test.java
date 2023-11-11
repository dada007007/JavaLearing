package com.itheima.homework.basic.answer1;
//定义一个学生类，里面定义姓名和年龄两个属性。重写toString()方法，改变输出对象时的内容
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("小明",16);
        System.out.println(s1);
    }
}
