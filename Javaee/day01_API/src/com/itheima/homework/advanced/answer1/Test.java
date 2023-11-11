package com.itheima.homework.advanced.answer1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
已知手机的价格是3999, 钢化膜的价格是9.9, 店家促销策略为: 满4000打98折.
现在小明买了一台手机和两块钢化膜, 请问小明应该付多少钱(精确到分)？
*/
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明购买的的手机数量:");
        String a = sc.next();
        System.out.println("请输入小明购买的的钢化膜数量:");
        String b = sc.next();
        sale(a, b);

    }

    public static void sale(String a, String b) {
        BigDecimal cellphone = new BigDecimal("3999");
        BigDecimal ironized = new BigDecimal("9.9");
        BigDecimal cellphone_number = new BigDecimal(a);
        BigDecimal ironized_number = new BigDecimal(b);
        BigDecimal cellphone_sum = cellphone.multiply(cellphone_number);
        BigDecimal ironized_sum = ironized.multiply(ironized_number);
        BigDecimal sum = cellphone_sum.add(ironized_sum);
        if (sum.doubleValue() >= 4000) {
            System.out.println("满足打折条件");
            sum = sum.multiply(new BigDecimal("0.98"));
            BigDecimal rs = sum.divide(new BigDecimal("1"), 2, RoundingMode.HALF_UP);
            System.out.println("打折后价格为：" + rs);
        }else {
            System.out.println("总价为：" + sum);
        }


    }
}
