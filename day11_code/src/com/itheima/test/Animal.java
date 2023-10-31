package com.itheima.test;

public class Animal {
    private String color;
    private int age;

    public void eat(String something){
        System.out.println("动物正在吃东西" + something);
    }

    public Animal() {
    }

    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
