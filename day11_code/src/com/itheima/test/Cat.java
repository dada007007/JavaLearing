package com.itheima.test;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat(String something) {
        System.out.println("岁数为:"+getAge()+"的"+getColor()+"猫正在吃"+something);
    }

    public void catchMouse(){
        System.out.println("猫正在捉老鼠");
    }
}
