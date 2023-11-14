package com.itheima.d4_list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        // 目标：掌握List的特有方法。
        // 1、创建一个List集合对象 (一行经典代码)
        ArrayList<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");

        // 2、给某个位置插入一个数据
        list.add(2, "前端");
        System.out.println(list);

        // 3、根据索引删除数据: 返回被删除的数据！
        System.out.println(list.remove(1));
        System.out.println(list);

        // 4、修改索引位置处的数据
        list.set(0, "Java入门");
        System.out.println(list);

        // 5、根据索引取数据
        System.out.println(list.get(2));

    }
}
