package com.itheima.homework1.answer3;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

//随机生成8个不重复的10至20之间的随机数并保存Set集合中,然后打印出集合中所有的数据;
public class Test {
    public static void main(String[] args) {
        Random rd = new Random();
        Set<Integer> nums = new LinkedHashSet<>();
        for (int i = 1; i <= 8; i++) {
            int num = rd.nextInt(11) + 10;
            if (nums.contains(num)) {
                i--;
            } else {
                System.out.println("第" + i + "次生成的随机数是：" + num);
                nums.add(num);
            }
        }
        System.out.println("集合中保存的" + nums.size() + "个不重复的随机数是：" + nums);
    }
}
