package com.itheima.forDemo;

public class Demo2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.print('\n');
        for (int i = 6; i <= 12; i++) {
            System.out.print(i + " ");
        }
        System.out.print('\n');
        for (int i = 11; i >= 8; i--) {
            System.out.print(i + " ");
        }
        System.out.print('\n');
        for (int i = 1; i < 9; i += 2) {
            System.out.print(i + " ");
        }
        System.out.print('\n');
        //数字.forr倒着产生for循环
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}
