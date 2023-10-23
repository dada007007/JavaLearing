package com.itheima.scanner;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("请输入a");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入b");
        int b = new Scanner(System.in).nextInt();
        System.out.println("请输入c");
        int c = new Scanner(System.in).nextInt();

        int mid = a > b ? a : b;
        System.out.println(mid > c ? mid : c);
    }
}
