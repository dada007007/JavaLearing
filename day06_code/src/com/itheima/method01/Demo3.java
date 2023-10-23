package com.itheima.method01;

import java.util.Scanner;

//  求1-n的和
public class Demo3 {
    public static void main(String[] args) {
        System.out.println("请输入您想计算的n:" );
        int n = new Scanner(System.in).nextInt();
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
