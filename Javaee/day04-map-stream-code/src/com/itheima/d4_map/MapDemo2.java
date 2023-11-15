package com.itheima.d4_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        // 目标：掌握Map集合的常用API(重点)
        Map<String, Integer> map = new HashMap<>();
        map.put("手表" ,2);
        map.put("iphone" ,31);
        map.put("huawei" ,365);
        map.put("iphone" ,1);
        map.put("娃娃", 31); // 31
        map.put("Java入门",31);
        map.put(null,null);
        System.out.println(map);
        // map = {null=null, 手表=2, huawei=365, Java入门=1, 娃娃=31, iphone=1}



        // 1、获取集合的大小（元素个数）
        System.out.println(map.size()); // 6

        // 2、清空集合
//         map.clear();
//         System.out.println(map);

        // 3、判断集合是否为空
        System.out.println(map.isEmpty()); // false

        // 4、根据键获取对应的值（重点）
        System.out.println(map.get("huawei")); // 365
        System.out.println(map.get("Java入门"));  // 1
        System.out.println(map.get("Java入门2")); // null

        // 5、根据键删除整个数据，返回删除数据对应的值。（重点）
        System.out.println(map.remove("iphone"));
        System.out.println(map);

        // 6、判断是否包含某个键（重点）
        System.out.println(map.containsKey("娃娃"));
        System.out.println(map.containsKey("娃娃2"));

        // 7、判断是否包含某个值
        System.out.println(map.containsValue(1));
        System.out.println(map.containsValue(31));
        System.out.println(map.containsValue("1")); // false

        // 8、获取Map集合的全部键，到一个Set集合中返回的
        // public Set<K> keySet():
        Set<String> keys = map.keySet();
        System.out.println(keys);

        // 9、获取Map集合的全部值：到一个Collection集合中返回的。
        //  Collection<V> values(); // 注意：由于Map集合的值可能重复，因此没有返回Set集合
        Collection<Integer> values = map.values();
        System.out.println(values);
    }
}
