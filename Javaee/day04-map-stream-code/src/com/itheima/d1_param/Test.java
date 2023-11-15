package com.itheima.d1_param;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // 目标：掌握可变参数的使用。
        sum();
        System.out.println("-------------------");

        sum(10);
        System.out.println("--------------------");

        sum(10, 20, 30, 40);
        System.out.println("--------------------");

        sum(new int[]{11, 12, 13, 14, 15});
        System.out.println("--------------------");
    }

    /**
     * 需求：求任意个整数的和。
     */
    // 可变参数的注意事项： 一个形参列表中只能有一个可变参数，并且可变参数必须放到形参列表的最后面。
    public static void sum(int...nums){
        // 原理和本质：可变参数对外可以灵活的接收数据，对内本质就是一个数组。
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
    }
}
