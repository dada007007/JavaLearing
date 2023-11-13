package com.itheima.d2_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
    目标：掌握Collections集合工具类的使用
 */
public class CollectionsTest1 {
    public static void main(String[] args) {
        // 1、public static <T> boolean addAll(Collection<? super T> c, T...elements):为集合批量添加数据
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三","李四","王五","张麻子");
        System.out.println(names);

        // 2、public static void shuffle(List<?> list):打乱List集合中的元素顺序。
        Collections.shuffle(names);
        System.out.println(names);

        // 3、public static void sort(List<?> list):对List集合中的元素进行升序排序。
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);

        // 4、public static void sort(List<?> list, Comparator<? super T> c):对List集合中的元素顺序。

    }
}
