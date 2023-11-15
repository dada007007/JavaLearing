package com.itheima.d5_map_travesal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        // 目标：掌握Map集合的遍历方式二：键值对遍历（难度大点）
        Map<String, Integer> map = new HashMap<>();
        map.put("蜘蛛精", 1000);
        map.put("小龙女", 23);
        map.put("木婉清", 31);
        map.put("黄蓉", 35);
        System.out.println(map);
        // map = {蜘蛛精=1000, 小龙女=23, 黄蓉=35, 木婉清=31}

        // 1、一开始用增强for循环直接遍历键值对数据
        // for(数据类型 变量名 : map){
        //
        // }
        // Map集合中的键值对数据直接来看是没有数据类型的。因此，增强for不能直接遍历Map集合了。

        // 2、把Map集合转换成Set集合遍历，目的是让集合中的元素有类型了。
        // map = {蜘蛛精=1000, 小龙女=23, 黄蓉=35, 木婉清=31}
        //    ↓
        // entries = [(蜘蛛精=1000), (小龙女=23), (黄蓉=35), (木婉清=31)]  元素的类型 Map.Entry<String,Integer>
        //                             entry
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "===>" + value);
        }
    }
}









