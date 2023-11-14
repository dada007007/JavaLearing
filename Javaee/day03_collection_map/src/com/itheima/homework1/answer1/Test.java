package com.itheima.homework1.answer1;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<Integer> red = new TreeSet();
        Random rd = new Random();
        while (red.size() != 6) {
            int red_nums = rd.nextInt(33) + 1;
            red.add(red_nums);
        }
        int blue_num = rd.nextInt(16) + 1;
        System.out.println("红球：" + red + " | 蓝球：" + blue_num);
    }
}
