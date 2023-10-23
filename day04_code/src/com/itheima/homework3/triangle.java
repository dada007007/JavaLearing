package com.itheima.homework3;
//正等腰三角形
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        System.out.println("请输入您想要的三角形行数：");
        int line = new Scanner(System.in).nextInt();
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= line-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
