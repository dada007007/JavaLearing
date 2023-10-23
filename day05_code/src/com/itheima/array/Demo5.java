package com.itheima.array;


public class Demo5 {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50, 60};
        for (int i = 0; i < num.length / 2; i++) {
            int temp = 0;
            temp = num[i];
            num[i] = num[num.length - 1 - i];
            num[num.length - 1 - i] = temp;
        }
        for (int j : num) {
            System.out.print(j + "\t");
        }
    }
}
