package com.itheima.homework.basic.answer5;

import java.time.LocalDateTime;

//请编写程序，使用LocalDateTime类获取日历对象，并分别获取年、月、日、小时、分、秒，并将它们打印到控制台。
public class Test {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.print(ldt.getYear() + "年");
        System.out.print(ldt.getMonthValue() + "月");
        System.out.print(ldt.getDayOfMonth() + "日");
        System.out.print(ldt.getHour() + "时");
        System.out.print(ldt.getMinute() + "分");
        System.out.print(ldt.getSecond() + "秒");
    }
}
