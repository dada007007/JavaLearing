package com.itheima.forDemo;

public class fortest {
    public static void main(String[] args) {
        int e = 0;
        for (int i = 100; i <= 999; i++) {
            double a, b, c, d;
            a = i / 100;
            b = i % 100 / 10;
            c = i % 10;
            d = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);

            if (i == d) {
                e++;
            }
        }
        System.out.println(e);
    }
}

