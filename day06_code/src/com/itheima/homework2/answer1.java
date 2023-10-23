package com.itheima.homework2;

import java.util.Scanner;

/*通过键盘录入两个整数n和m。
n代表行数，m代表列数。
定义一个方法，方法的功能是打印n行m列的@符号。
执行效果如下：
请输入行数：
4
请输入列数：
5
@@@@@
@@@@@
@@@@@
@@@@@
*/
public class answer1 {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        System.out.println("请输入行数");
        m = new Scanner(System.in).nextInt();
        System.out.println("请输入列数");
        n = new Scanner(System.in).nextInt();
        print(m, n);
    }

    public static void print(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
