package com.itheima.homework1;

import java.util.Scanner;

//定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
public class answer2 {
    public static void main(String[] args) {
        System.out.println("请输入第一个整数");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个整数");
        int b = new Scanner(System.in).nextInt();
        System.out.println("请输入第三个整数");
        int c = new Scanner(System.in).nextInt();
        System.out.println(getMax(a, b, c));
    }

    public static int getMax(int a, int b, int c) {
        int max = 0;
        if (a >= b && a >= c) {
            max = a;
        } else if (c <= b) {
            max = b;
        } else {
            max = c;
        }
        return max;

    }


}
