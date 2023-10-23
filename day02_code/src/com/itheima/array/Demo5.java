package com.itheima.array;

public class Demo5 {
    public static void main(String[] args) {
        int num = 321;
        int a = num / 100;
        System.out.println(a);
        int b = num % 100 / 10;
        System.out.println(b);
        int c = num % 10;
        System.out.println(c);
        int m = 10;
        int n  = 5;
        int rs3 = m++ + ++m - --n - ++n + 1 + m--;
        System.out.println(rs3);

        m += 5;
        System.out.println(m);

    }


}
