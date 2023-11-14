package com.itheima.d5_map_traverse;

import com.itheima.d3_collection_test.Room;
import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 目标：完成Map集合的案例：统计投票人数
 */
public class MapDemo4 {
    public static void main(String[] args) {
        // 1、把80个学生选择的景点数据拿到程序中来。
        ArrayList<String> data = new ArrayList<>();
        String[] selects = {"A", "B", "C", "D"};
        Random rd = new Random();
        for (int i = 0; i < 80; i++) {
            // 每次模拟一个学生选择一个景点，存入到集合中取。
            int index = rd.nextInt(4);// 0 1 2 3
            data.add(selects[index]);
        }
        System.out.println(data);

        // 2、统计每个景点的投票人数
        Map<String, Integer> result = new HashMap<>();

        //3、开始遍历80个景点数据
        for (String s : data) {
            // 问问Map集合中是否存在该景点
            if (result.containsKey(s)){
                // 说明这个景点之前统计过,其值加1，存入到Map集合中
                result.put(s,result.get(s)+1);
            }else{
                // 说明这个景点第一次存
                result.put(s,1);
            }
        }
        System.out.println(result);
    }
}
