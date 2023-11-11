package com.itheima.d4_stringbuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        // 目标：学会使用StringBuilder: 操作字符串数据的。
        // 1、创建StringBuilder对象，封装字符串数据。
        StringBuilder sb = new StringBuilder();  // sb = ""
//        StringBuilder sb2 = new StringBuilder("黑马");  // sb = "黑马"
//        System.out.println(sb);
//        System.out.println(sb2);

        // 2、调用方法append拼接字符串数据进去
        sb.append("黑马").append(666).append(true).append(99.5);
        System.out.println(sb);

        // 3、反转内容
        sb.reverse();
        System.out.println(sb);

        // 4、获取长度
        System.out.println(sb.length());

        // 5、把StringBuilder对象转换成String类型。
        // StringBuilder只是一种操作字符串的手段。
        // String才是目的。
        String rs = sb.toString();
        System.out.println(rs);
    }
}
