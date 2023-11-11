package com.itheima.homework.advanced.answer5;
/*
某林业工人孙工，作息规律为上三天班，休息一天，经常不确定休息日是否是周末
为此，请你开发一个程序，当孙工输入年以及月，以日历方式显示对应月份的休息日，用中括号进行标记
（可以查看以前的休息情况和将来的休息情况）。同时，统计出本月有几天休息，轮到周末休息有几天。
（ 注：首次休息日是2020年2月1日）
*/

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份和月份：");
        String date = sc.next();
        date += "-01";
        System.out.println(date);
        turn(date);
    }

    public static void turn(String date) {
        LocalDateTime first_date = LocalDateTime.of(2020, 2, 1, 0, 0, 0);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate ld = LocalDate.parse(date, dtf);
        System.out.println(ld.lengthOfMonth());
        ld = ld.withDayOfMonth(ld.lengthOfMonth());
        LocalTime lt = LocalTime.of(0, 0, 0);
        LocalDateTime ldt = LocalDateTime.of(ld, lt);
        Duration d = Duration.between(first_date, ldt);
        System.out.println("间隔天数：" + d.toDays());
        int end = ldt.getMonthValue();
        LocalDate ld1 = first_date.toLocalDate();

        System.out.print("[");
        while (ld1.getMonthValue() <= end) {
            System.out.print(ld1 + ", ");
            ld1 = ld1.plusDays(4);
            if (ld1.getMonthValue() == end && ld1.plusDays(4).getMonthValue() > end) {
                System.out.println(ld1 + "]");
                break;
            }
        }

        LocalDate ld2 = first_date.toLocalDate();
        int count = 0;
        System.out.print("[");
        while (ld2.getMonthValue() <= end) {
            ld2 = ld2.plusDays(4);
            if (ld2.getMonthValue() == end && ld2.plusDays(4).getMonthValue() <= end) {
                System.out.print(ld2 + ", ");
                count++;
            }
            if (ld2.getMonthValue() == end && ld2.plusDays(4).getMonthValue() > end) {
                System.out.println(ld2 + "]");
                count++;
                break;
            }

        }

        System.out.println("当前月份休息日为：" + count + "天");

        System.out.println("--------------------");

        LocalDate ld3 = first_date.toLocalDate();
        while (ld3.getMonthValue() <= end) {
            if (ld3.getDayOfWeek().getValue() == 6 || ld3.getDayOfWeek().getValue() == 7) {
                System.out.print("[" + ld3 + "] ");
            } else {
                System.out.print(ld3 + " ");
            }
            ld3 = ld3.plusDays(4);

            if (ld3.getMonthValue() > end) {
                break;
            }
        }
    }
}
