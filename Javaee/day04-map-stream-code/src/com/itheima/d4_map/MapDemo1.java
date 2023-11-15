package com.itheima.d4_map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        // 目标：掌握Map集合的特点。
        // Map体系整体特点：HashMap ： 按照键，无序，不重复，无索引。值不做要求，键和值都可以是null
        Map<String, Integer> map = new HashMap<>(); // 多态 (一行经典代码)
        // Map<String, Integer> map = new LinkedHashMap<>(); // 多态  有序 不重复 无索引
        map.put("手表" ,2);
        map.put("iphone" ,31);
        map.put("huawei" ,365);
        map.put("iphone" ,1);
        map.put("娃娃", 31);
        map.put("Java入门",1);
        map.put(null,null);
        // {null=null, 手表=2, huawei=365, Java入门=1, 娃娃=31, iphone=1}
        System.out.println(map);

    }
}
