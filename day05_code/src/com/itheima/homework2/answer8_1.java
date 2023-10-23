package com.itheima.homework2;

/*
定义一个数组其中包含多个数字。
用自己的方式最终实现，
奇数放在数组的左边，
偶数放在数组的右边。
（可以创建其他数组，不必须在原数组中改变）
        */
public class answer8_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        for (int j : arr) {
            if (j % 2 == 1) {
                arr2[left] = j;
                left++;
            } else {
                arr2[right] = j;
                right--;
            }
        }
        for (int j : arr2) {
            System.out.print(j + " ");
        }
    }
}
