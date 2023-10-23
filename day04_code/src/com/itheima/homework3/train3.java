package com.itheima.homework3;

import java.util.Scanner;

//从键盘输入一个0~99999之间的任意数，判断输入的数是几位数
public class train3 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入数字：");
            int num = new Scanner(System.in).nextInt();
            if (num >= 0 && num <= 99999){
                int weishu = 0;
                if (num == 0) {
                    System.out.println("您输入的数字是" + 1 + "位数");
                    break;
                }
                while (num > 0) {
                    num /= 10;
                    weishu++;
                }
                System.out.println("您输入的数字是" + weishu + "位数");
                break;
            }else{
                System.out.println("您输入的数字不合法，请重新输入");
            }
        }

    }
}
