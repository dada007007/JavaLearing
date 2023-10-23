package com.itheima.homework3;

import java.util.Scanner;

public class answer2 {
    public static void main(String[] args) {
/*  让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。*/
        System.out.println("请输入第一个整数： ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个整数： ");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println("请输入第三个整数： ");
        int num3 = new Scanner(System.in).nextInt();
        int min;
        if (num1 < num2) {
            if (num1 < num3) {
                min = num1;
            } else {
                min = num3;
            }
        } else {
            if (num2 < num3) {
                min = num2;
            } else {
                min = num3;
            }
        }
        System.out.println("三个数中的最小值是：" + min);
    }
}
