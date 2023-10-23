package com.itheima.homework1;

import java.util.Scanner;

//定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
public class answer1 {
    public static void main(String[] args) {
        System.out.println("请输入第一个小数");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("请输入第二个小数");
        double b = new Scanner(System.in).nextDouble();
        System.out.println(getMin(a, b));
    }

    public static double getMin(double a, double b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
