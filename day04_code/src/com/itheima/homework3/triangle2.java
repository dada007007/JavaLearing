package com.itheima.homework3;

import java.util.Scanner;
//侧三角形
public class triangle2 {
    public static void main(String[] args) {
        System.out.println("请输入你想要的三角形行数：");
        int line = new Scanner(System.in).nextInt();
        for (int i = 1; i <= line ; i++) {
            for (int j = 1; j <= line - i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 2 * i -1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= line - 1 ; i++) {
            for (int j = i; j <= 2 * i -1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= line - i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
