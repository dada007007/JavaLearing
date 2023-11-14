package com.itheima.d8_stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        // 1、如何获取List集合的Stream流？
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张无忌", "周芷若", "赵敏", "张丽");
        Stream<String> stream = names.stream();

        // 2、如何获取Set集合的Stream流？
        Set<String> set = new HashSet<>();
        Collections.addAll(set, "刘德华", "张曼玉", "蜘蛛精", "玛德", "德玛西亚");
        Stream<String> stream1 = set.stream();
        stream1.filter(s -> s.contains("德")).forEach(s -> System.out.println(s));


        // 3、如何获取Map集合的Stream流？
        Map<String, Double> map = new HashMap<>();
        map.put("古力娜扎", 172.5);
        map.put("迪丽热巴", 169.8);
        map.put("马儿扎哈", 168.3);
        map.put("卡尔扎巴", 166.3);
        map.put("牛魔王", 183.6);

        Set<String> keys = map.keySet();
        Stream<String> ks = keys.stream();

        Collection<Double> values = map.values();
        Stream<Double> vs = values.stream();

        Set<Map.Entry<String, Double>> entries = map.entrySet();
        Stream<Map.Entry<String, Double>> kvs = entries.stream();
        kvs.filter(e -> e.getKey().contains("巴"))
                .forEach(e-> System.out.println(e.getKey()+"-->"+e.getValue()));


        // 4、如何获取数组的Stream流？
        String[] names2 = {"张翠山","东方不败","唐大山","孤独求败"};
        Stream<String> s1 = Arrays.stream(names2); // 获取数组的stream流方法一
        Stream<String> s2 = Stream.of(names2);     // 获取数组的stream流方法二


    }
}
