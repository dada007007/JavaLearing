package com.itheima.utils;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 5, 3, 2, 6, 4};
        //利用数组工具类操作数组
        //1:将数组的内容 转换成字符串
        // public static String toString(数组)
        System.out.println(Arrays.toString(arr));

        //2:public static int[] copyOfRange(旧数组,起始索引,结束索引)
        //         基于旧数组 产生 新数组 新数组就是从旧数组截取的一部分
        int[] arr2 = Arrays.copyOfRange(arr, 1, 4);
        System.out.println(Arrays.toString(arr2));

        //3:拷贝一个新数组 public static copyOf(旧数组)
        //       从老数组 头  截取指定长度
        int[] arr3 =Arrays.copyOf(arr,4);
        System.out.println(Arrays.toString(arr3));
        int[] arr4 =Arrays.copyOf(arr,11);
        System.out.println(Arrays.toString(arr4));

        // 4: 对数组进行排序 public static void sort(数组)
        System.out.println("排序前:"+Arrays.toString(arr));
        Arrays.sort(arr);//排序
        System.out.println("排序后:"+Arrays.toString(arr));

    }
}
