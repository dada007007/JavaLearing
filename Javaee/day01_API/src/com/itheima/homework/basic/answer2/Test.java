package com.itheima.homework.basic.answer2;

import java.util.Objects;

/*
1.定义两个字符串，使用Objects的equals()方法，判断内容是否相同
2.定义一个字符串和一个null,使用Objects的equals()方法，判断内容是否相同
3.定义一个字符串赋值为null,使用Objects的isNull()方法，判断内容是否为空。
4.定义一个字符串赋值为null,使用Objects的nonNull()方法，判断内容是否不为空。
*/
public class Test {
    public static void main(String[] args) {
//        1.定义两个字符串，使用Objects的equals()方法，判断内容是否相同
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(Objects.equals(s1, s2));     //true

//        2.定义一个字符串和一个null,使用Objects的equals()方法，判断内容是否相同
        String s3 = "abc";
        String s4 = null;
        System.out.println(Objects.equals(s3, s4));     //false

//        3.定义一个字符串赋值为null,使用Objects的isNull()方法，判断内容是否为空。
        System.out.println(Objects.isNull(s4));         //true

//        4.定义一个字符串赋值为null,使用Objects的nonNull()方法，判断内容是否不为空。
        System.out.println(Objects.nonNull(s4));         //false
    }
}
