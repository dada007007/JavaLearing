package com.itheima.demo2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // 1、定义订单集合存储订单信息。
        List<Order> orders = new ArrayList<>();

        // 2、提示用户录入3个订单信息
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请您输入订单信息：");
            String data = sc.nextLine(); // 编号,时间,金额
            String[] dataArr = data.split(",");

            // 3、每次收到的数据都是一个订单对象
            Order order = new Order();
            order.setId(Integer.valueOf(dataArr[0]));
            order.setTime(LocalDate.parse(dataArr[1]));
            order.setMoney(Integer.valueOf(dataArr[2]));

            // 4、订单存入集合
            orders.add(order);
        }

        // 5、对集合进行降序（金额）
        Collections.sort(orders, (o1, o2) -> o2.getMoney() - o1.getMoney());

        // 遍历
        int allMoney = 0;
        for (Order order : orders) {
            System.out.println(order);
            allMoney += order.getMoney();
        }
        System.out.println(allMoney);
    }
}
