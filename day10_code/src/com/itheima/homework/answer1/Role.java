package com.itheima.homework.answer1;

public class Role {
    private String name;
    private int age;

    public void viewCourse() {
        System.out.println(getName() + "查看课表");
    }

    public Role() {
    }

    public Role(String name, int age) {
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
}
