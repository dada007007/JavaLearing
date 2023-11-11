package com.itheima.d6_system_runtime;

/**
 * 目标：了解下System类的常见方法。
 */
public class SystemTest {
    public static void main(String[] args) {
        // 1、public static void exit(int status):
        //   终止当前运行的Java虚拟机。
        //   该参数用作状态代码; 按照惯例，非零状态代码表示异常终止。
//        System.out.println("开始。。");
//        System.exit(0);
//        System.out.println("结束。。");

        // 2、public static long currentTimeMillis():
        //    获取当前系统的时间
        //    返回的是long类型的时间毫秒值：指的是从1970-1-1 0:0:0开始走到此刻的总的毫秒值，1s = 1000ms
        long time1 = System.currentTimeMillis();

        // 用来做性能分析：
        for (int i = 1; i < 1000000; i++) {
            System.out.println(i);
        }

        long time2 = System.currentTimeMillis();
        System.out.println("耗时：" + (time2 - time1) / 1000.0);

    }
}
