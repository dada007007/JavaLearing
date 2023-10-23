package com.itheima.homework3;

import java.util.Random;

//生成两个[10,20]之间的随机数
// 如果生成的两个数不相等，再重新生成 ，直到两个数相等为止
public class train5 {
    public static void main(String[] args) {
        int a, b;
        while (true) {
            a = new Random().nextInt(10, 21);
            b = new Random().nextInt(10, 21);
            if(a == b){
                System.out.println("随机生成的两数相等");
                break;
            }else {
                System.out.println("生成的两数不等，分别为：" + a + "," + b);
            }
        }
    }
}
