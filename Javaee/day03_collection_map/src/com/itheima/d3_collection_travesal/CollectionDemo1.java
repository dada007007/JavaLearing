package com.itheima.d3_collection_travesal;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        // 目标：掌握Collection集合的遍历方式一：迭代器遍历。
        Collection<String> list = new ArrayList<>();
        list.add("叶孤城");
        list.add("陆小凤");
        list.add("赵凯");
        list.add("徐绎丰");
        System.out.println(list);
        // list = [叶孤城, 陆小凤, 赵凯, 徐绎丰]
        //          it

        // 1、得到集合的迭代器对象
        Iterator it = list.iterator();

        // 2、可以通过迭代器去遍历数据: 取数据，然后移动到下一个位置
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
        // System.out.println(it.next()); // NoSuchElementException

        // 3、使用循环遍历。
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
