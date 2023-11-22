package com.itheima.demo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*现在有5个红包，依次是520,66,99,100,999，请开发一个多线程程序，
可以模拟5个粉丝来抢红包的逻辑，每个红包只能被一个粉丝抢到。*/
public class Test4 {
    public static void main(String[] args) {
        Hongbao hongbao = new Hongbao(new int[]{520,66,99,100,999});
        // 创建5个线程。
        new getThread(hongbao, "小明").start();
        new getThread(hongbao, "小红").start();
        new getThread(hongbao, "小黑").start();
        new getThread(hongbao, "小皮").start();
        new getThread(hongbao, "小贾").start();
    }
}
