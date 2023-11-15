package com.itheima.homework.answer4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入商品名称，每行输入一个，以end结束");
        Map<String, Integer> commodity = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.next();
            if (s.equals("end")) {
                break;
            }
            if (commodity.containsKey(s)) {
                commodity.put(s, commodity.get(s) + 1);
            } else {
                commodity.put(s, 1);
            }
        }
        commodity.forEach((k, v) -> System.out.println(k + "售出数量是：" + v));
    }
}
