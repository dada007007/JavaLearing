package com.itheima.d5_stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        // 目标：学会使用StringJoiner
        int[] arr = {11, 22, 33, 23};
        String result = getArrayData(arr);
        System.out.println(result);
    }


    public static String getArrayData(int[] arr) {
        if (arr == null) {
            return null;
        }

        // 1、创建一个StringJoiner对象，准备拼接内容。
        // 参数一：间隔符号
        // 参数二：开始符号
        // 参数三：结束符号
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        // 2、遍历这个数组中的每个数据开始拼接
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }

        // 3、返回数据
        return sj.toString();
    }
}
