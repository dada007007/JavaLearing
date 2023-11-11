package com.itheima.d8_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class test {
    public static void main(String[] args) {
        // 1、创建一个日期时间格式化器对象出来。
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");

        // 2、对时间进行格式化
        LocalDateTime ldt = LocalDateTime.now();
        String rs = dtf.format(ldt);
        System.out.println(rs);

        // 3、格式化时间，其实还有一种方案。
        String rs2 = ldt.format(dtf);
        System.out.println(rs2);

        // 4、解析时间：解析时间一般使用LocalDateTime提供的解析方法来解析。
        String dateStr = "2023-11-11 11:11:11";
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt2 = LocalDateTime.parse(dateStr, dtf2);
        System.out.println(ldt2);





    }
}
