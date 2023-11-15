package com.itheima.d5_map_travesal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        // 目标：掌握Map集合的遍历方式一：键找值
        Map<String, Integer> map = new HashMap<>(); // 一行经典代码
        map.put("iphone", 6);
        map.put("小米", 3);
        map.put("huawei", 3);
        map.put("诺基亚", 31);
        System.out.println(map);  // {huawei=3, 诺基亚=31, iphone=6, 小米=3}

        // 1、先获取Map集合的全部键到一个Set集合中去。
        Set<String> keys = map.keySet();

        // 2、遍历键找值
        for (String key : keys) {
            // 根据键提取值
            Integer value = map.get(key);
            System.out.println(key + "===>" + value);
        }
    }
}
