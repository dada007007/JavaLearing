package com.itheima.d8_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张无忌", "周芷若", "赵敏", "张丽");
        System.out.println(names);
        // name = [张三丰, 张无忌, 周芷若, 赵敏, 张丽]

        // 找出姓张，且是3个字的名字，存入到一个集合中
        List<String> list = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("张") && name.length() == 3) {
                list.add(name);
            }
        }
        System.out.println(list);

        // 开始使用Stream流来解决这个需求
        List<String> list1 = names.stream().filter(s -> s.startsWith("张") && s.length() == 3)
                .collect(Collectors.toList());
        System.out.println(list1);


    }
}
