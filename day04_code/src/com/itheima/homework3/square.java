package com.itheima.homework3;

import java.util.Scanner;

//输入正方形的边长，输出正方形
public class square {
    public static void main(String[] args) {
        System.out.println("请输入正方形的边长：");
        int length = new Scanner(System.in).nextInt();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("*"+'\t');
            }
            System.out.println("");
        }
    }
}
