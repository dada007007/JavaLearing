package com.itheima.homework3;
//十个亿 一天花一半 能花多少天
public class train2 {
    public static void main(String[] args) {
        int money = 1000000000;
        int day = 0;
        while(money > 0){
            money /= 2;
            day += 1;
            System.out.println(money);
        }

        System.out.println(day);
    }
}