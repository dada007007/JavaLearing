package com.itheima.d5_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        // 目标：了解Set家族的特点：无序，不重复，无索引。
        // Set<String> set = new HashSet<>(); // 一行经典代码
        Set<String> set = new LinkedHashSet<>(); // 有序，不重复，无索引。
        set.add("java1");
        set.add("java1");
        set.add("html");
        set.add("html");
        set.add("css");
        set.add("黑马");
        System.out.println(set);

        HashSet<String> set2 = new HashSet<>(); // 一行经典代码
        set2.add("java1");

        System.out.println((16 - 1) & "abc".hashCode());
        System.out.println((16 - 1) & "abdfsac".hashCode());
        System.out.println((16 - 1) & "ffasfsa".hashCode());
        System.out.println((16 - 1) & new Object().hashCode());
    }
}
