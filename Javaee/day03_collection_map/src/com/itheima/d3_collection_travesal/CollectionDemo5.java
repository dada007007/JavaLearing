package com.itheima.d3_collection_travesal;

import java.util.ArrayList;

public class CollectionDemo5 {
    public static void main(String[] args) {
        // 目标：理解三种遍历的区别。
        // 1、集合的并发修改异常： 以遍历删除为例。
        ArrayList<String> names = new ArrayList<>();
        names.add("Java入门");
        names.add("红枸杞");
        names.add("枸杞子");
        names.add("菊花");
        names.add("黑枸杞");
        names.add("宁夏枸杞");
        names.add("肾宝");
        System.out.println(names);
        // names = [Java入门, 红枸杞, 枸杞子, 菊花, 黑枸杞, 宁夏枸杞, 肾宝]
        // names = [Java入门,  枸杞子, 菊花, 宁夏枸杞, 肾宝]
        //             i
//        for (int i = 0; i < names.size(); i++) {
//            String name = names.get(i);
//            if(name.contains("枸杞")){
//                names.remove(name);
//                i--; // 每删除一个数据，退一步！
//            }
//        }
//        System.out.println(names);

        // 2、迭代器遍历并删除：爆出一个并发修改异常的错误: oncurrentModificationException
//        Iterator<String> it = names.iterator();
//        while (it.hasNext()) {
//            String name = it.next();
//            if (name.contains("枸杞")) {
//                // names.remove(name); // 如果用集合的方法删除，还是出差！
//                it.remove(); // 使用迭代器自己的删除方法，删除当前迭代器遍历到的数据！就不会出现bug!
//            }
//        }
//        System.out.println(names);

        // 3、增强for能不能遍历删除呢？不可以的，它本身是迭代器的简化版写法，没有办法直接用迭代器的删除方法删除数据。
//        for (String name : names) {
//            if(name.contains("枸杞")){
//                names.remove(name);
//            }
//        }
//        System.out.println(names);

        // 4、Lambda是否可以遍历并删除？ 不可以的，因为它的底层就是基于增强for遍历。
        names.forEach(name -> {
            System.out.println(name);
            if(name.contains("枸杞")){
                names.remove(name);
            }
        });
        System.out.println(names);
    }
}
