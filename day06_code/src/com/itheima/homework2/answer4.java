package com.itheima.homework2;

import java.util.Scanner;

/*
已知一个数组 arr = {19, 28, 37, 46, 50};
键盘录入一个数据，查找该数据在数组中的索引。
并在控制台输出找到的索引值。如果没有查找到，则输出-1
提示:
方法参数  数组  被查找的元素
方法返回值   元素在数组中的索引 不存在就是-1
找到就停止，找不到继续找，循环完毕找不到就是找不到。
*/
public class answer4 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        System.out.println("请输入一个您想找的数字：");
        int num = new Scanner(System.in).nextInt();
        System.out.println(findindex(num, arr));
    }

    public static int findindex(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
