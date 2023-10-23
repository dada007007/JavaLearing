package com.itheima.homework3;

public class answer1 {
    public static void main(String[] args) {
//  定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
        double a, b;
        a = 4;
        b = 6;
        System.out.println(min1(a, b));
    }

    public static double min1(double a, double b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

    public static double min2(double a, double b) {
        if (a > b) {
            return b;
        }
        return a;

    }

    public static double min3(double a, double b) {
        return (a > b) ? b : a;

    }
    public static double min4(double a, double b) {
        return Math.min(a, b);

    }

}
