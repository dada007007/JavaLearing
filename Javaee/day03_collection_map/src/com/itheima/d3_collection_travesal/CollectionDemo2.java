package com.itheima.d3_collection_travesal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        // 目标：掌握Collection集合的遍历方式二：增强for(foreach遍历)。
        Collection<String> list = new ArrayList<>();
        list.add("叶孤城");
        list.add("陆小凤");
        list.add("赵凯");
        list.add("徐绎丰");
        System.out.println(list);

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------------------------------------------");

        String[] names = {"王一博", "吴亦凡", "蔡徐坤", "马保国"};
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(Arrays.toString(names));
    }
}
