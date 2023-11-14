package com.itheima.d4_map;

import java.util.*;

public class MapTest2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("手表",100);
        map.put("手表",220); // 后面重复的数据会覆盖前面的数据（键）
        map.put("手机",2);
        map.put("Java",2);
        map.put(null,null);
        System.out.println(map);

        // 获取集合大小
        System.out.println(map.size());

        // 清空集合
//        map.clear();
//        System.out.println(map);
        //判断集合是否为空
//        System.out.println(map.isEmpty());

        int v1 = map.get("手表");
        System.out.println(v1);
        System.out.println(map.get("手机")); // 2
        System.out.println(map.get("张三")); // null

        // 根据键删除整个元素（删除键会返回键的值）
        System.out.println(map.remove("手表"));
        System.out.println(map);

        // 判断是否包含某个键
        System.out.println(map.containsKey("手表")); // false
        System.out.println(map.containsKey("手机")); // true
        System.out.println(map.containsKey("java")); // false 精确匹配
        System.out.println(map.containsKey("Java")); // true

        // 判断是否包含某个值
        System.out.println(map.containsValue(2));   // true
        System.out.println(map.containsValue("2"));   // false

        // 获取集合的所有键
        Set<String> keys = map.keySet();
        System.out.println(keys);

        // 获取集合的所有值
        Collection<Integer> values = map.values();
        System.out.println(values);

        // 把其他集合的元素倒入到自己的集合中来
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("java1", 10);
        map1.put("java2", 20);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("java3", 10);
        map2.put("java2", 222);

        map1.putAll(map2);  // 把map2集合中的元素全部倒入一份到map1中
        System.out.println(map1);
        System.out.println(map2);
    }
}
