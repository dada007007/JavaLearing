package com.itheima.d4_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        // 目标：掌握List的遍历方式
        // 1、创建一个List集合对象(一行经典代码)
        List<String> list = new ArrayList<>();
        list.add("金毛狮王");
        list.add("谢逊");
        list.add("白眉鹰王");
        list.add("张三丰");
        System.out.println(list);

        // 一、for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 二、迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 三、增强for循环
        for (String s : list) {
            System.out.println(s);
        }

        // 四、Lambda
        list.forEach(s -> {
            System.out.println(s);
        });
    }
}
