package com.itheima.homework1;
/*需求:
        现有一个整数数组{100,50,90,60,80,70}。
        请编写程序，计算去掉最大值和最小值后的平均值（不考虑小数部分）*/
public class answer5 {
    public static void main(String[] args) {
        int[] arr = {100,50,90,60,80,70};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int ave = (sum - min - max) / (arr.length - 2);
        System.out.println(ave);
    }
}
