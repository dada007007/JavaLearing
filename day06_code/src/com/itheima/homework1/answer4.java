package com.itheima.homework1;

import java.util.Scanner;

/*
数字是有绝对值的，负数的绝对值是它本身取反，
非负数的绝对值是它本身。
请定义一个方法，方法能够得到小数类型数字的绝对值并返回。
请定义方法并测试。
*/
public class answer4 {
    public static void main(String[] args) {
        System.out.println("请输入您想得到绝对值的数：");
        double num = new Scanner(System.in).nextDouble();
        System.out.println(absolute(num));
    }
    public static double absolute(double a) {
        if (a < 0) {
            a = -a;
        }
        return a;
    }
}
