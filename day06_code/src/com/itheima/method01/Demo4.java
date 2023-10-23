package com.itheima.method01;

import java.util.Scanner;

// 判断奇偶数
public class Demo4 {
    public static void main(String[] args) {
        System.out.println("请输入您想判断的数字n" );
        int n = new Scanner(System.in).nextInt();
        jiorou(n);
    }

    public static void jiorou(int n){
        if(n % 2 == 0){
            System.out.println("您输入的数字为偶数");
        }else {
            System.out.println("您输入的数字为奇数");
        }
    }
}
