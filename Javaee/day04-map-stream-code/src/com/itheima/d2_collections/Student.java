package com.itheima.d2_collections;

// 方式一：让自定义的类实现一个Comparable比较规则接口
public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double height;
    @Override
    public int compareTo(Student o) {
        return this.age - o.age; // 升序
    }

    public Student() {
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}' + "\n";
    }


}

