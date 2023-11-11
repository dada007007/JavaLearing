package com.itheima.homework.basic.answer7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//请编写程序，使用LocalDateTime类获取日历对象，使用DateTimeFormatter把时间转换为yyyy年MM月dd日 HH时mm分ss秒
public class Test {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(ldt.format(dtf));
    }
}
