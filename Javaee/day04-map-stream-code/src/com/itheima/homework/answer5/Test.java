package com.itheima.homework.answer5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 某学校Java学科分为基础班和就业班:
 * Java基础班:
 * 001	李晨
 * 002	范冰冰
 * Java就业班:
 * 001	马云
 * 002	马化腾
 * 使用HashMap嵌套HashMap方式完成存储数据,并遍历出所有的学生
 */
public class Test {
    public static void main(String[] args) {
        Map<String, HashMap<String, String>> Java = new HashMap<>();
        HashMap<String, String> clazzse = new HashMap<>();
        clazzse.put("001", "李晨");
        clazzse.put("002", "范冰冰");
        HashMap<String, String> clazzee = new HashMap<>();
        clazzee.put("001", "马云");
        clazzee.put("002", "马化腾");
        Java.put("Java基础班", clazzse);
        Java.put("Java进阶班", clazzee);
        System.out.println(Java);
        Set<String> strings = Java.keySet();
        for (String string : strings) {
            HashMap<String, String> clazz = Java.get(string);
            Set<String> integers = clazz.keySet();
            for (String integer : integers) {

                System.out.println(integer + "\t" + clazz.get(integer));
            }
        }


    }
}
