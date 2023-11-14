package com.itheima.d7_collection_nesting;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // 1、定义一个Map集合存储全部的省份信息，和其对应的城市信息
        Map<String, List<String>> map = new HashMap<>();
        List<String> cities1 = new ArrayList<>();
        Collections.addAll(cities1,"南京市","扬州市","苏州市","无锡市","常州市");
        map.put("江苏省",cities1);

        List<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2,"武汉市","孝感市","十堰市","宜昌市","鄂州市");
        map.put("湖北省",cities2);


        System.out.println(map);

        map.forEach((p,c) -> System.out.println(p+"---->"+c));
    }
}
