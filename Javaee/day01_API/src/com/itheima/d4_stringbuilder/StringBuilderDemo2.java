package com.itheima.d4_stringbuilder;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        // 目标：理解StringBuilder的操作性能较好。
//        String str = "";
//        for (int i = 0; i < 1000000 ; i++) {
//            str += "abc";
//        }
//        System.out.println(str);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);
    }
}
