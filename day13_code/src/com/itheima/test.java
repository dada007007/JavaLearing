package com.itheima;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,6,2,3,9,6,4};
        System.out.println(Arrays.toString(arr));
        int[] arr2 = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(arr2));

    }
}
