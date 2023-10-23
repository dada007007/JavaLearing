package com.itheima.array;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        double[] arr = new double[6];
        double ave = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分：");
            int score = new Scanner(System.in).nextInt();
            arr[i] = score;
        }
        for (double j : arr) {
            ave += j;
        }
        ave /= arr.length;
        System.out.println(ave);
    }
}
