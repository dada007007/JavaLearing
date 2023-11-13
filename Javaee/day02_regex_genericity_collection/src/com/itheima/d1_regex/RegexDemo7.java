package com.itheima.d1_regex;

import java.util.Arrays;

/**
 * 目标：了解使用正则表达式做搜索替换，内容分割。
 */
public class RegexDemo7 {
    public static void main(String[] args) {
        // 1、public String replaceAll(String regex , String newStr)：按照正则表达式匹配的内容进行替换
        // 需求1：请把 古力娜扎ai8888迪丽热巴999aa5566马尔扎哈fbbfsfs42425卡尔扎巴，中间的非中文字符替换成 “-”
        String s1 = "古力娜扎ai8888迪丽热巴99fafas9aa5566马尔扎哈fbbADFFfsfs42425卡尔扎巴";
        // 参数一：正则表达式，匹配内容的。 参数二：替换的内容
        String s = s1.replaceAll("\\w+", "-");
        System.out.println(s);


        // 需求2(拓展，了解，可以不记)：
        // 某语音系统，收到一个口吃的人说的“我我我喜欢编编编编编编编编编编编编程程程！”，需要优化成“我喜欢编程！”。
        String s2 = "我我我喜欢编编编编编编编编编编编编程程程";
        /**
         * (.)一组：.匹配任意字符的。
         * \\1 :为这个组声明一个组号：1号
         * +：声明必须是重复的字
         * $1可以去取到第1组代表的那个重复的字
         */
        String result2 = s2.replaceAll("(.)\\1+", "$1");
        System.out.println(result2);


        // 2、public String[] split(String regex)：按照正则表达式匹配的内容进行分割字符串，反回一个字符串数组。
        // 需求1：请把 古力娜扎ai8888迪丽热巴999aa5566马尔扎哈fbbfsfs42425卡尔扎巴，中的人名获取出来。
        String[] names = s1.split("\\w+");
        System.out.println(Arrays.toString(names));
    }
}
