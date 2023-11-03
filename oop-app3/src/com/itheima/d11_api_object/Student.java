package com.itheima.d11_api_object;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重写equals方法，比较两个对象的内容一样就返回true
    //比较者：s2 == this
    //被比较者： s1 == o
    @Override
    public boolean equals(Object o) {
        //1.判断两个对象是否地址一样，一样返回true。
        if (this == o) return true;
        //2、判断o是null直接返回false，或者比较者和被比较者类型不一样，也返回false
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
