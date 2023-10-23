package com.itheima.homework2;

import java.util.Scanner;

/*有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
再通过键盘录入一个整数数字。要求：把数字放入数组序列中，生成一个新的数组，
并且数组的元素依旧是从小到大排列的。执行效果如下：
请输入一个整数数字：
        50
生成的新数组是：12 14 23 45 50 66 68 70 77 90
*/
public class answer6 {
    public static void main(String[] args) {
        int[] arr1 = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int[] arr2 = new int[arr1.length + 1];
        System.out.println("请输入一个数字");
        int num = new Scanner(System.in).nextInt();
        arr2[0] = num;
        for (int i = 0; i < arr1.length; i++) {
            arr2[i + 1] = arr1[i];
        }
        int temp = 0;
        for (int i = 0; i < arr2.length - 1; i++) {
            if (arr2[i] > arr2[i + 1]) {
                temp = arr2[i];
                arr2[i] = arr2[i + 1];
                arr2[i + 1] = temp;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
