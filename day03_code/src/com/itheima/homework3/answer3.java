package com.itheima.homework3;

import java.util.Scanner;

public class answer3 {
    public static void main(String[] args) {
/* 键盘录入三个整数,其中前两个整数代表参加运算的数据，第三个整数为要进行的运算
(1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)，演示效果如下:
		请输入第一个整数: 30
		请输入第二个整数: 40
		请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法): 1
		控制台输出:30+40=70      */
        while (true) {
            int a, b, c;
            System.out.println("请输入第一个整数： ");
            a = new Scanner(System.in).nextInt();
            System.out.println("请输入第二个整数： ");
            b = new Scanner(System.in).nextInt();
            System.out.println("请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法): ");
            int oper = new Scanner(System.in).nextInt();
            switch (oper) {
                case 1:
                    c = a + b;
                    System.out.println(a + "+" + b + "=" + c);
                    return;
                case 2:
                    c = a - b;
                    System.out.println(a + "-" + b + "=" + c);
                    return;
                case 3:
                    c = a * b;
                    System.out.println(a + "*" + b + "=" + c);
                    return;
                case 4:
                    c = a / b;
                    System.out.println(a + "/" + b + "=" + c);
                    return;
                default:
                    System.out.println("您输入的数字不合法");
            }
        }
    }
}
