package com.itheima.homework1;

import java.util.Scanner;

/*在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。执行效果如下：
 请输入第一个整数：10
请输入第二个整数：30
请输入第三个整数：20
从大到小的顺序是： 30 20 10 */
public class answer3 {
    public static void main(String[] args) {
        System.out.println("请输入第一个整数");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个整数");
        int b = new Scanner(System.in).nextInt();
        System.out.println("请输入第三个整数");
        int c = new Scanner(System.in).nextInt();
        method(a, b, c);
    }
    private static void method(int a, int b, int c) {
        int max = 0;
        int min = 0;
        int mid = 0;
        if (a >= b && a >= c) {
            max = a;
        } else if (c <= b) {
            max = b;
        } else {
            max = c;
        }
        if (a <= b && a <= c) {
            min = a;
        } else if (c >= b) {
            min = b;
        } else {
            min = c;
        }
        mid = a + b + c - max - min;
        System.out.println("从大到小的顺序是：" + max + " " + mid + " " + min);
    }
}
