package com.itheima.d2_collection_api;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionAPTDemo1 {
    public static void main(String[] args) {
        // 目标：掌握Collection提供的常用方法：是全部单列集合都可以直接用的。
        // 1、添加数据 boolean add(E e)
        Collection<String> list = new ArrayList<>();
        list.add("楚留香");
        list.add("张无忌");
        list.add("张无忌");
        list.add("韦小宝");
        list.add("张三丰");
        list.add("张三丰");
        System.out.println(list); // list = [楚留香, 张无忌, 张无忌, 韦小宝, 张三丰, 张三丰]

        // 2、清空集合
        // list.clear();
        // System.out.println(list);

        // 3、判断集合是否为空
        System.out.println(list.isEmpty()); // false

        // 4、直接删除集合中的某个数据:默认只能删除第一个张无忌
        list.remove("张无忌");
        System.out.println(list);

        // 5、判断集合中是否包含某个数据
        System.out.println(list.contains("韦小宝"));
        System.out.println(list.contains("韦小宝2"));

        // 6、获取集合的大小（元素个数）
        System.out.println(list.size());


        // 7、把集合转化成数组。
        Object[] array = list.toArray();
        System.out.println("内容：" + Arrays.toString(array));

        // 8、拓展一下：把别人集合的数据加给自己.
        Collection<String> c1 = new ArrayList<>(); // 多态
        c1.add("java1");
        c1.add("java2");

        Collection<String> c2 = new ArrayList<>(); // 多态
        c2.add("java2");
        c2.add("java3");

        c1.addAll(c2); // 把别人集合的数据加给自己.

        System.out.println(c1);
        System.out.println(c2);
    }
}
