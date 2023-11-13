package com.itheima.d2_exception;

import java.util.Scanner;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("定价是："+getPrice());
                break;
            } catch (Exception e) {
                System.out.println("您输入的价格格式有误");
            }
        }
    }

    public static double getPrice(){
        System.out.println("请您输入价格：");
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        return price;
    }
}
