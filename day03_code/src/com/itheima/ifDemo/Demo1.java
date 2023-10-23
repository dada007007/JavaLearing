package com.itheima.ifDemo;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        System.out.println("请输入您的分数： ");
        int score = new Scanner(System.in).nextInt();
        if (score >= 95 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 90) {
            System.out.println("良");
        } else if (score >= 90) {
            System.out.println("良");
        } else if (score >= 80) {//  score<15 && score>12
            System.out.println("及格");
        } else { // 前面条件都不满足  score<12
            System.out.println("不及格");
        }
    }
}
