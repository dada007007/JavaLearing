package com.itheima.test;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat(String something) {
        System.out.println("岁数为:"+getAge()+"的"+getColor()+"狗正在吃"+something);
    }

    public void lookHouse(){
        System.out.println("狗正在看家");
    }
}
