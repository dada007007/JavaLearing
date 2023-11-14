package com.itheima.d3_collection_travesal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo3 {
    public static void main(String[] args) {
        // 目标：掌握Collection集合的遍历方式三：lambda表达式
        Collection<String> list = new ArrayList<>();
        list.add("叶孤城");
        list.add("陆小凤");
        list.add("赵凯");
        list.add("徐绎丰");

//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        list.forEach(s -> System.out.println(s) );
        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
    }
}
