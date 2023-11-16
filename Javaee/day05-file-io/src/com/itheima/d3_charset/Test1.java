package com.itheima.d3_charset;


import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws Exception {
        // 目标：学会使用程序完成字符的编码和解码
        // 1、编码：把字符串编码成字节形式。
        String s1 = "abc我爱你中国123";
        byte[] bytes = s1.getBytes(); // 默认采用平台编码UTF-8编码
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        String s2 = "乘风破浪会有时，直挂云帆济沧海abc";
        byte[] bytes1 = s2.getBytes("GBK"); // 指定字符集GBK编码
        System.out.println(bytes1.length);
        System.out.println(Arrays.toString(bytes1));

        // 2、解码
        String rs1 = new String(bytes); // 默认采用平台编码UTF-8解码
        System.out.println(rs1);

        String rs2 = new String(bytes1, "GBK"); // 指定字符集GBK解码
        System.out.println(rs2);
    }
}
