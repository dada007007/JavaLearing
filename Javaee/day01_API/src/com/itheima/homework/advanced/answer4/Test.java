package com.itheima.homework.advanced.answer4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
1. 已知日期字符串:"2015-10-20",将该日期字符串转换为日期对象；
2. 将(1)中的日期对象转换为日历类的对象；
3. 根据日期对象获取该日期是星期几,以及这一年的第几天
4. 通过键盘录入日期字符串，格式(2015-10-20)
*/
public class Test {
    public static void main(String[] args) {
        //4. 通过键盘录入日期字符串，格式(2015-10-20)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期：（格式为例2015-10-20）");
        String date = sc.next();
        turn(date);
    }
    public static void turn(String date){
        //1. 已知日期字符串:"2015-10-20",将该日期字符串转换为日期对象；
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //2. 将(1)中的日期对象转换为日历类的对象；
        LocalDate ld = LocalDate.parse(date, dtf);
        //3. 根据日期对象获取该日期是星期几,以及这一年的第几天
        System.out.println("2015年10月20日是星期" + ld.getDayOfWeek().getValue());
        System.out.println("2015年10月20日是这一年第" + ld.getDayOfYear() + "天");
    }
}
