package com.itheima.d8_time;

import java.time.*;
import java.util.Set;

public class Test4_ZoneId_ZonedDateTime {
    public static void main(String[] args) {
        // 目标：了解时区和带时区的时间。
        // 1、ZoneId（用于获取时区的）的常见方法：
        // public static ZoneId systemDefault(): 获取系统默认的时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId.getId());

        // public static Set<String> getAvailableZoneIds(): 获取Java支持的全部时区Id
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds); // America/New_York

        // public static ZoneId of(String zoneId) : 把某个时区id封装成ZoneId对象。
        ZoneId aZoneId = ZoneId.of("America/New_York");

        // 2、ZonedDateTime：带时区的时间。
        // public static ZonedDateTime now(ZoneId zone): 获取某个时区的ZonedDateTime对象。
        ZonedDateTime zdt = ZonedDateTime.now(aZoneId);
        System.out.println(zdt);

        // public static ZonedDateTime now()：获取系统默认时区的ZonedDateTime对象
        ZonedDateTime zdt2 = ZonedDateTime.now();// 没有给时区
        System.out.println(zdt2);

        // 很多服务器要获取世界时间(时间)。 UTC。
        ZonedDateTime utcNow = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(utcNow);

        ZonedDateTime currentUtcTime = ZonedDateTime.now(java.time.ZoneOffset.UTC);
        System.out.println(currentUtcTime);
    }
}
