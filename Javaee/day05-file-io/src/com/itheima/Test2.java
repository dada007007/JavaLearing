package com.itheima;

import java.io.UnsupportedEncodingException;

public class Test2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "钉纹龙杨金达";
        byte[] bytes = s.getBytes("GBK");
        String gbk = new String(bytes, "UTF-8");
        byte[] gbks1 = gbk.getBytes("UTF-8");
        String gbk1 = new String(gbks1, "GBK");
        System.out.println(gbk1);

    }
}
