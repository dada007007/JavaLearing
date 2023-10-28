package com.itheima.Oopdemo1;

public class Car {
    String name;
    int price;
    String type;

    public void run(){
        System.out.println("价值"+price+"的"+name+"正在运行");
    }

    public void start(){
        System.out.println("价值"+price+"的"+name+"正在高速路奔驰");
    }
}
