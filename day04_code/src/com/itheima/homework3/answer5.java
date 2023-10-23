package com.itheima.homework3;

public class answer5 {
    public static void main(String[] args) {
/*        需求:
        现有一个整数数组{100,50,90,60,80,70}。
        请编写程序，计算去掉最大值和最小值后的平均值（不考虑小数部分）*/
        int arr[] = {100, 50, 90, 60, 80, 70};
        int temp1 = arr[0];
        int temp2 = arr[0];
        int sum = 0;
        int ave = 0;
        int time = 0;
        for (int i = 0; i < arr.length; i++) {
            temp1 = Math.max(temp1, arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            temp2 = Math.min(temp2, arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == temp1 || arr[i] == temp2) {
                arr[i] = 0;
                time += 1;
            }
            sum += arr[i];
            ave = sum / (arr.length - time);
        }
        System.out.println(ave);

    }
}
