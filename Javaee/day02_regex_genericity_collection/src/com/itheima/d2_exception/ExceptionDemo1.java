package com.itheima.d2_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ExceptionDemo1 {
    public static void main(String[] args) throws ParseException {
        // 目标：认识异常。
        // 1、运行时异常(一般是程序员的水平差导致的)
        int[] arr = {11, 22, 33};
        // System.out.println(arr[3]); // 出现索引越界异常： ArrayIndexOutOfBoundsException

        String name = null;
        System.out.println(name);
        System.out.println(name.length()); // 空指针异常： NullPointerException

        // 2、编译时异常: 代码写完就会出现的错误。(在于提醒程序员，你的代码在这里很容易出现bug,请注意)
        String s = "2023-11-11 11:11:10";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(s);
        System.out.println(d);
    }
}
