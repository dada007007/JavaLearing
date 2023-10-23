package com.itheima.homework3.answer1;

public class Method {
    public void start() {
        Car car = new Car();
        String brand = car.getBrand();
        System.out.println(brand + "开始启动");
    }

    public void run() {
        Car car = new Car();
        String brand = car.getBrand();
        String type = car.getType();
        System.out.println(brand + type + "在高速公路上行驶");
    }
}
