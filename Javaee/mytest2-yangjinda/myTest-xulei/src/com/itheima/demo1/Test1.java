package com.itheima.demo1;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        // 1、定义容器装6个红球号码。
        Set<Integer> redNumbers = new TreeSet<>();
        // 2、存入6个不重复的随机红球号码 1-35
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int number = r.nextInt(35) + 1;
            // 先拿集合的元素个数
            int size1 = redNumbers.size();
            redNumbers.add(number);
            // 再拿集合的元素个数
            int size2 = redNumbers.size();
            if(size1 == size2) {
                i--;
            }
        }
        System.out.println(redNumbers);
        int blueNumber = r.nextInt(15) + 1;
        System.out.println(blueNumber);

        System.out.println("------------------------------------------------------");

        Set<Integer> luckRedNumber = new HashSet<>();
        Collections.addAll(luckRedNumber, 10, 12, 30, 16, 7, 17);
        System.out.println(luckRedNumber);

        int luckBlueNumber = 12;
        System.out.println(luckBlueNumber);

        System.out.println("---------------------------------------------");
        int count1 = 0;
        int count2 = 0;
        for (Integer redNumber : redNumbers) {
            if(luckRedNumber.contains(redNumber)) count1++;
        }
        count2 = blueNumber == luckBlueNumber ? 1 : 0;
        System.out.println("中了几个红球号码：" + count1);
        System.out.println("中了几个篮球号码：" + count2);

    }
}
