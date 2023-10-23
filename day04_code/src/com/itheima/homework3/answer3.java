package com.itheima.homework3;

public class answer3 {
    public static void main(String[] args) {
/*        需求:
        现有一个整数数组{100,50,90,60,80,70}。请编写代码，计算数组中的所有元素的最小值并打印。*/
        int arr[] = {100, 50, 90, 60, 80, 70};
        int temp = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            temp = temp < arr[i] ? temp : arr[i];
            temp = Math.min(temp, arr[i]);
        }
        System.out.println(temp);
    }
}
