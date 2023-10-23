package com.itheima.homework3;

import java.util.Scanner;

public class answer2 {
//  定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
    public static void main(String[] args) {
        System.out.println("请输入第一个整数： ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个整数： ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("请输入第三个整数： ");
        int c = new Scanner(System.in).nextInt();
        System.out.println(find_max(a, b, c));
    }

    public static int find_max(int a,int b,int c){
        int max;
        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b < c) {
                max = b;
            } else {
                max = c;
            }
        }
        System.out.println("三个数中的最大值是：" + max);
        return max;
    }
}
