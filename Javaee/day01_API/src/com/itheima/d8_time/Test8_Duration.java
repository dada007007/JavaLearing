package com.itheima.d8_time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test8_Duration {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2023, 11, 11, 11, 10, 10);
        LocalDateTime end = LocalDateTime.of(2024, 1, 1, 11, 11, 11);

        // 1、得到Duration对象
        Duration duration = Duration.between(start, end);

        // 2、获取两个时间对象间隔的信息
        System.out.println(duration.toDays());// 间隔多少天
        System.out.println(duration.toHours());// 间隔多少小时
        System.out.println(duration.toMinutes());// 间隔多少分
        System.out.println(duration.toSeconds());// 间隔多少秒
        System.out.println(duration.toMillis());// 间隔多少毫秒
        System.out.println(duration.toNanos());// 间隔多少纳秒

        System.out.println("-------------------------高考倒计时----------------------------------");
        // 需求：高考时间是： 2024-06-07 09:00:00
        LocalDateTime ldt = LocalDateTime.now(); // 今天
        System.out.println(ldt);

        String str = "2024-06-07 09:00:00";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt2 = LocalDateTime.parse(str , dtf); // 高考时间

        // 计算现在离高考差多少天，多少小时，多少分，多少秒。
        Duration duration1 = Duration.between(ldt, ldt2);
        System.out.println(duration1.toDays() + " " + duration1.toHoursPart() + " " + duration1.toMinutesPart() + " " + duration1.toSecondsPart());
    }
}
