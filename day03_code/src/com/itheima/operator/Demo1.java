package com.itheima.operator;

public class Demo1 {
    public static void main(String[] args) {
        //三元运算符
        int i = 88;
        int j =50;

        System.out.println( i > 60 ? "成绩合格" : "成绩不合格");
        System.out.println( j > 60 ? "成绩合格" : "成绩不合格");

        int m, n;
        m = 10;
        n = 20;
        System.out.println( m > n ? m : n);

        int a, b, c;
        a = 1;
        b = 2;
        c = 3;
        int mid = a > b ? a : b;
        System.out.println(mid > c ? mid : c);

    }
}
