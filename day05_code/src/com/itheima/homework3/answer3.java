package com.itheima.homework3;

import java.util.Scanner;

/*   数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。
    请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试
     比如:
	小数数字 -6.6 的绝对值是 6.6
	小数数字 6.6 的绝对值是 6.6
*/
public class answer3 {
    public static void main(String[] args) {

        double a = new Scanner(System.in).nextDouble();
        System.out.println(absolute(a));
    }

    public static double absolute(double a) {
        if (a <= 0) {
            a = -a;
        }
        return a;
    }
}
