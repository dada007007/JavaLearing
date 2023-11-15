package com.itheima.d5_map_travesal;

import java.util.*;

public class MapTest4 {
    public static void main(String[] args) {
        // 目标：使用Map集合完成投票案例。
        // 1、准备同学们选择的景点，80个选择。
        String[] names = {"玉龙雪山", "伶仃岛", "漓江", "五台山"};

        // 2、定义一个集合存储80个学生的选择。
        List<String> selects = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            selects.add(names[r.nextInt(names.length)]);
        }
        System.out.println(selects);

        // 3、统计每个景点想去的人数是多少。
        // 定义一个Map集合(键是景点，值是出现的次数)，用于存储最终统计的结果
        Map<String, Integer> map = new HashMap<>(); // map = {}

        // 4、遍历每个学生选择景点去map集合中统计：
        // selects = [伶仃岛, 五台山, 五台山, 五台山, 五台山, 漓江, 玉龙雪山, 伶仃岛, 漓江, .....
        for (String name : selects) {
            // 5、去map集合中看这个景点是否之前统计过，如果统计过，其值+1，如果没有统计过存入“景点=1”
//            if(map.containsKey(name)){
//                // 如果统计过，其值+1
//                map.put(name, map.get(name) + 1);
//            }else {
//                // 如果没有统计过存入“景点=1”
//                map.put(name, 1);
//            }
            map.put(name, map.containsKey(name) ? map.get(name) + 1 : 1);
        }

        System.out.println(map);
    }
}
