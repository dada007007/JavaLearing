package com.itheima.d1_collection;

import java.util.*;

public class CollectionDemo1 {
    public static void main(String[] args) {
        // 目标：简单认识Collection集合的家族特点
        // 1、List家族特点：有序，可重复，有索引。
        List<String> list = new ArrayList<>();
        list.add("楚留香");
        list.add("张无忌");
        list.add("张无忌");
        list.add("韦小宝");
        list.add("张三丰");
        list.add("张三丰");
        System.out.println(list);

        // 2、Set家族的特点： 无序，不重复，没有索引
        Set<String> set = new HashSet<>();
        set.add("韦小宝");
        set.add("张三丰");
        set.add("张三丰");
        set.add("楚留香");
        set.add("张无忌");
        set.add("张无忌");
        System.out.println(set);
    }
}
