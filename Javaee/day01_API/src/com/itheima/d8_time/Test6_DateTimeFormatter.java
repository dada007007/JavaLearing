package com.itheima.d8_time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 *  目标：掌握JDK 8新增的DateTimeFormatter格式化器的用法。(重点)
 */
public class Test6_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // 1、创建一个日期时间格式化器对象出来。参数：格式化的时间形式。
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd HH:mm:ss EEE a");

        // 2、对时间进行格式化
        String result = dtf.format(ldt);
        System.out.println(result);

        // 3、格式化时间，其实还有一种方案。
        String result2 = ldt.format(dtf);
        System.out.println(result2);

        // 4、解析时间：解析时间一般使用LocalDateTime提供的解析方法来解析。
        String dateStr = "2023-11-11 11:11:11";
        // 创建日期时间格式化对象 : 参数格式，必须与被解析的时间格式一样
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 调用LocalDateTime的parse方法，按照dtf2规定的格式解析字符串时间成为日期时间对象。
        LocalDateTime ldt2 = LocalDateTime.parse(dateStr, dtf2);
        System.out.println(ldt2);
        System.out.println(ldt2.getDayOfYear());
    }
}






