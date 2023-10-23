package com.itheima.homework2;
/*
定义一个数组来存储10个学生的成绩，
例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。计算并输出学生的平均成绩。
*/
public class answer5 {
    public static void main(String[] args) {
        double[] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        double ave = 0;
        for (int i = 0; i < arr.length; i++) {
            ave += arr[i];
        }
        ave /= arr.length;
        System.out.println(ave);
    }
}
