package com.itheima.d10_reflect;

public class Student {
    private String name;
    private char sex;

    public void eat() {
        System.out.println("学生吃东西！");
    }

    private String eat(String name, int age) {
        System.out.println("开始吃。。");
        return name + "正在吃" + age + "个馒头";
    }

    public Student() {
        System.out.println("==无参数构造器执行==");
    }

    private Student(String name) {
        this.name = name;
    }

    private Student(String name, char sex) {
        System.out.println("==两个参数构造器执行==");
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
