package com.itheima.array;

public class Demo2 {
    public static void main(String[] args) {
        int[] sale = {16, 26, 36, 6, 100};
        int sum = 0;
        for (int i = 0; i < sale.length; i++) {
            sum += sale[i];
        }
        System.out.println(sum);
    }
}
