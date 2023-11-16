package com.itheima.d3_charset;

import java.io.UnsupportedEncodingException;


public class selftest1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String srcString = "我们是中国人";

        String gbk2UtfString = new String(srcString.getBytes("GBK"), "UTF-8");

        System.out.println("GBK转换成UTF-8：" + gbk2UtfString);

        String gbk2Utf2GbkString = new String(gbk2UtfString.getBytes("UTF-8"), "GBK");

        System.out.println("GBK转换成UTF-8再转成GBK：" + gbk2Utf2GbkString);

    }
}
