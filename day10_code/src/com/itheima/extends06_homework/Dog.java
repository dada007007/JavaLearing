package com.itheima.extends06_homework;

public class Dog extends Animal{
    public void lookDoor(){
        System.out.println(getName() + "在看门");
    }

    public void eat(){
        System.out.println("狗吃肉");
    }
    public Dog() {
    }

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }
}
