package com.itheima.homework2.answer2;
/*
请定义一个Collection类型的集合，存储以下分数信息：
88.5,39.2,77.1,56.8,89.0,99.0,59.5
**要求:**
请编程实现以下功能：
使用增强for遍历所有元素，并打印
使用增强for遍历所有元素，打印不及格的分数；
使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
使用增强for遍历所有元素，求出最高分，并打印；
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Collection<Double> scores = new ArrayList<>();
        scores.add(88.5);
        scores.add(39.2);
        scores.add(77.1);
        scores.add(56.8);
        scores.add(89.0);
        scores.add(99.0);
        scores.add(59.5);
        print(scores);
        print_nonpass(scores);
        print_nonpass_ave(scores);
        print_topscore(scores);
    }

    public static void print(Collection<Double> scores) {
//        使用增强for遍历所有元素，并打印
        System.out.println("使用增强for遍历所有元素,打印结果如下：");
        for (Double score : scores) {
            System.out.println(score);
        }
    }

    public static void print_nonpass(Collection<Double> scores) {
//        使用增强for遍历所有元素，打印不及格的分数；
        System.out.println("使用增强for遍历所有元素,打印不及格分数结果如下：");
        for (Double score : scores) {
            if (score < 60) {
                System.out.println(score);
            }
        }

    }

    public static void print_nonpass_ave(Collection<Double> scores) {
//        使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
        int count = 0;
        double sum = 0;
        for (Double score : scores) {
            if (score < 60) {
                count++;
                sum += score;
            }

        }
        System.out.println("不及格分数的数量为：" + count);
        System.out.println("不及格平均分为：" + sum / count);

    }

    public static void print_topscore(Collection<Double> scores) {
//        使用增强for遍历所有元素，求出最高分，并打印；
        double max = 0;
        for (Double score : scores) {
            if (max < score) {
                max = score;
            }
        }
        System.out.println("最高分是" + max);

    }

}
