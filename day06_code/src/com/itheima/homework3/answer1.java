package com.itheima.homework3;

import java.util.Random;

/*
需求:
定义一个方法getCount，该方法接收一个int数组,方法内部计算并返回数组中元素值小于数组平均值的个数
1：在main方法中创建长度为7的int数组,
2：存储7个20到80(包含20,包含80)int数字,存储到数组中
3：在main方法中 调用getCount方法,传递数组,获取结果并打印
*/
public class answer1 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            int a = new Random().nextInt(20, 81);
            arr[i] = a;
        }
        System.out.print("生成的数组内元素为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

        }
        System.out.println();
        System.out.println("元素值小于平均数的个数为：" + getCount(arr));
    }

    public static int getCount(int[] arr) {
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        avg = avg / arr.length;
        System.out.println("平均数为：" + avg);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                sum++;
            }
        }
        return sum;

    }
}
