package com.itheima.switchDemo;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("请输入星期几: ");
        String date = new Scanner(System.in).next();
        switch (date){
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二":
            case "周三":
            case "周四":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周五":
                System.out.println("自己整理代码");
                break;
            case "周六":
            case "周日":
                System.out.println("打游戏");
                break;
        }
    }
}
