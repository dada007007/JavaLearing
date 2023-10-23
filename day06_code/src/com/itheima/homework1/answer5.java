package com.itheima.homework1;

import java.util.Scanner;

/*
请定义一个方法，
对正数的小数进行四舍五入的操作(不考虑负数情况)。
四舍五入之后的结果是一个int整数类型并返回。
最后对方法进行测试。
*/
public class answer5 {
    public static void main(String[] args) {
        System.out.println("请输入您想四舍五入的小数");
        double num = new Scanner(System.in).nextDouble();
        System.out.println(halfJust(num));
    }

    public static int halfJust(double n) {
        int n1 = (int) (n * 10);
        int a = n1 % 10;
        if (a <= 4) {
            return (int) n;
        } else {
            return (int) n + 1;
        }
    }
}
