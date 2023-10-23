package com.itheima.forDemo;
// 找出三位数中的水仙花数 ：个十百位数字立方和为此数字
public class Demo4 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            double a, b, c, d;
            a = i / 100;
            b = i % 100 / 10;
            c = i % 10;
            d = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);
            if (i == d) {
                System.out.println(i);
            }
        }
    }
}
