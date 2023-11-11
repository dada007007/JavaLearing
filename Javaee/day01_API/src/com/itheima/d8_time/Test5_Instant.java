package com.itheima.d8_time;

import java.time.Instant;

/**
 * 目标：掌握Instant的使用。
 */
public class Test5_Instant {
    public static void main(String[] args) {
       // 1、创建Instant的对象，获取此刻时间信息。
        Instant now = Instant.now(); // 世界标准时间
        System.out.println(now);

        // 2、获取总秒数
        System.out.println(now.getEpochSecond());
        // 3、不够1秒的纳秒数
        System.out.println(now.getNano());

        // Instant对象的作用：做代码的性能分析，或者记录用户的操作时间点

    }
}
