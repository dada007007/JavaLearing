package com.itheima.method01;

public class Demo1 {
    public static void main(String[] args) {
        Demo1 de = new Demo1();
        System.out.println(de.sum(2,3));
    }

    public int sum(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }
}
