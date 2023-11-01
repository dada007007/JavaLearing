package com.itheima.test;

public class Dog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    public void Swimming() {
        System.out.println("狗狗刨");
    }
}
