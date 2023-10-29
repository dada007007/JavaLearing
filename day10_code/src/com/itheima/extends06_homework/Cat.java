package com.itheima.extends06_homework;

public class Cat extends Animal{
    public void play(){
        System.out.println(getName() + "在玩");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public Cat() {
    }

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }
}
