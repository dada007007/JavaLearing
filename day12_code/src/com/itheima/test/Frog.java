package com.itheima.test;

public class Frog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void Swimming() {
        System.out.println("青蛙蛙泳");
    }
}
