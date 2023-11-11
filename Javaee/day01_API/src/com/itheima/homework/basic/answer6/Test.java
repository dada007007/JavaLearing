package com.itheima.homework.basic.answer6;

import java.time.LocalDateTime;

//请编写程序，使用LocalDateTime类获取日历对象，计算一百天之后是几年几月几日
public class Test {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = ldt.plusDays(100);
        System.out.println(ldt2.getYear()+"年"+ldt2.getMonthValue()+"月"+ldt2.getDayOfMonth()+"日");
    }
}
