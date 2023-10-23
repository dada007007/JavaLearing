package com.itheima.homework2;

//不定义新数组。找到左边的偶数，和右边的奇数互换位置。
public class answer8_2 {
    public static void main(String[] args) {//不定义新数组。找到左边的偶数，和右边的奇数互换位置。
        int[] arr = {2, 12, 23, 4, 1, 2, 1, 2, 3, 4, 5, 6, 7, 8};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (arr[left] % 2 != 0) {
                left++;
            }
            while (arr[right] % 2 == 0) {
                right--;
            }
            if (left  > right) {
                break;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
