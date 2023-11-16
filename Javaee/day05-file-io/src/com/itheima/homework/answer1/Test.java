package com.itheima.homework.answer1;

public class Test {
    public static void main(String[] args) {
        int a = show();
        System.out.println(a);
    }

    public static int show() {
        try {
            System.out.println(1 / 0);
            System.out.println(111);
            return 1;
        } catch (Exception e) {
            System.out.println(222);
            return 2;
        } finally {
            System.out.println(333);
            return 3;
        }
    }
}
