package com.itheima.scanner;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("请输入姓名");
        String name = new Scanner(System.in).next();
        System.out.println("请输入整数");
        int num = new Scanner(System.in).nextInt();
        System.out.println("请输入小数");
        double num2 = new Scanner(System.in).nextDouble();
        System.out.println("name = " + name);
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);
    }
}
