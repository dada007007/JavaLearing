package com.itheima.homework.advanced.answer3;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Test {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2023, 11, 13, 6, 0, 0);
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDate ld = ldt.toLocalDate();
        LocalDate ld1 = ldt1.toLocalDate();
        Duration d = Duration.between(ldt1, ldt);
        System.out.println("距离秒杀开始还有：" + d.toDays() + "天" + d.toHoursPart() + "小时"
                + d.toMinutesPart() + "分钟" + d.toSecondsPart() + "秒");
    }
}
