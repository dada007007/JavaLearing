package com.itheima.homework3;
//菱形
import java.util.Scanner;

public class triangle3 {
    public static void main(String[] args) {
        System.out.println("请输入您想要的菱形行数：");
        int line2 = new Scanner(System.in).nextInt();
        int line = (line2 + 1) / 2;
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= line-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= line - 1; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int j = (line - i) * 2 - 2 ; j >= 0 ; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
