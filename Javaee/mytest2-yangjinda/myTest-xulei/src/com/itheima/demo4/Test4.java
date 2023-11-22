package com.itheima.demo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test4 {
    public static Random r = new Random();

    public static void main(String[] args) throws Exception {
        // 1、准备5个红包。
        List<Integer> moneys = new ArrayList<>();
        Collections.addAll(moneys, 999, 520, 99, 66, 100);
        System.out.println(moneys);

        // 2、准备5个线程抢红包。
        Thread t1 = new DrawMoneyThread("小皮", moneys);
        Thread t2 = new DrawMoneyThread("小黑", moneys);
        Thread t3 = new DrawMoneyThread("小甲", moneys);
        Thread t4 = new DrawMoneyThread("小王", moneys);
        Thread t5 = new DrawMoneyThread("小凯", moneys);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
//
//        t1.join();
//        t2.join();
//        t3.join();
//        t4.join();
//        t5.join();

//        System.out.println("活动结束！！");
    }
}
