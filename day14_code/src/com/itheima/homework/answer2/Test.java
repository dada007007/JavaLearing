package com.itheima.homework.answer2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("宝马", "黑色", 500000);
        Car car2 = new Car("奔驰", "红色", 300000);
        Car car3 = new Car("奥迪", "红色", 200000);

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        for (Car car : carList) {
            System.out.println(car.getBrand() + "-" + car.getColor() + "-" + car.getPrice());
        }
    }
}
