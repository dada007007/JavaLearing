package com.itheima.d2_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        // 调用方法：
        System.out.println("开始。。。。");
        try {
            testA();
        } catch (Exception e) {
            e.printStackTrace();
            // 记录异常信息
            // 响应合适的信息提醒用户。
        }
        System.out.println("结束。。。。");
    }

    public static void testA() throws Exception {
        testB();
        InputStream is = new FileInputStream("D:/meinv.png");
    }

    private static void testB() throws Exception {
        String s = "2023-11-11 11:11:10";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(s);
        System.out.println(d);
    }
}
