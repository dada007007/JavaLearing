package com.itheima.demo2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
//        通过控制台输入一个订单的完整信息(格式为:订单号,订单时间,订单金额)，如下：
//        111111,2020-05-27,200
        int i = 0;
        int sum = 0;
        List<Order> list = new ArrayList<>();
        while (i < 3) {
            System.out.println("请输入一个订单的完整信息(格式为:订单号,订单时间,订单金额)");
            Scanner sc = new Scanner(System.in);
            String next = sc.next();
            List<Order> save = save(next, list);
            i++;

        }
        list.sort((o1, o2) -> o2.getMoney() - o1.getMoney());
        System.out.println("排序后的订单为：");
        for (Order order : list) {
            System.out.println("order=" + order);
            sum += order.getMoney();
        }
        System.out.println("总金额：" + sum);

/*程序获取到输入的订单完整信息的字符串后，
通过逗号，进行切割，
创建一个订单对象，将订单对象保存到ArrayList集合中。*/
/*请输入3个订单信息，创建3个订单对象保存到ArrayList集合，
要求订单按照价格从高到低排序，并求出所有订单的总金额。*/
    }

    private static List<Order> save(String next, List<Order> list) {
        String[] data = next.split(",");
        int id = Integer.valueOf(data[0]);
        String dateStr = data[1] + " 00:00:00";
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt2 = LocalDateTime.parse(dateStr, dtf2);
        LocalDate localDate = ldt2.toLocalDate();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd HH:mm:ss EEE a");
        String result = dtf.format(ldt2);
        int money = Integer.valueOf(data[2]);
        Order order = new Order(id, localDate, money); //创建一个订单对象
        list.add(order);
        return list;
    }
}
