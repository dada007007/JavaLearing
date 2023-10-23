package com.itheima.homework3.answer2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入长方形的长");
        double i = new Scanner(System.in).nextDouble();
        System.out.println("请输入长方形的宽");
        double j = new Scanner(System.in).nextDouble();

        Rectangle r = new Rectangle(i,j);
        System.out.println(r.area());
        System.out.println(r.perimeter());

    }




}
