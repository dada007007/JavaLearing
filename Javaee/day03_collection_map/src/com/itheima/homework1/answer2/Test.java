package com.itheima.homework1.answer2;

import java.util.HashSet;

/*
已知数组信息如下:
{2.2,5.5,6.6,2.2,8.8,1.1,2.2,8.8,5.5,2.2,6.6}
请使用代码找出上面数组中的所有的数据,要求重复的数据只能保留一份;
*/
public class Test {
    public static void main(String[] args) {
        double[] nums = {2.2, 5.5, 6.6, 2.2, 8.8, 1.1, 2.2, 8.8, 5.5, 2.2, 6.6};
        HashSet<Double> num = new HashSet<>();
        for (double v : nums) {
            num.add(v);
        }
        System.out.println(num);
    }
}
