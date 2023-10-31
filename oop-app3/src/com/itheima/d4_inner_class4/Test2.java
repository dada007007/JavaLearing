package com.itheima.d4_inner_class4;

public class Test2 {
    public static void main(String[] args) {
        // 目标：掌握匿名内部类常见使用场景
//        Swimming s1 = new Swimming(){
//            @Override
//            public void swim() {
//                System.out.println("狗游泳飞快");
//            }
//        };
//        go(s1);
        go(new Swimming(){
            @Override
            public void swim() {
                System.out.println("狗游泳飞快");
            }
        });

    }

    // 设计一个方法，可以接受swimming接口的一切实现类对象进来参加游泳比赛
    public static void go(Swimming s){
        System.out.println("开始----------------");
        s.swim();


    }
}



// 猫和狗都要参加游泳比赛
interface Swimming{
    void swim();
}