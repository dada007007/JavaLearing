package com.itheima.d1_regex;

import java.util.Scanner;

public class RegexDemo3 {
    public static void main(String[] args) {
//        checkEmail();
        checkPhone();
    }

    public static void checkEmail() {
        while (true) {
            System.out.println("请您输入邮箱");
            String email = new Scanner(System.in).next();
            //43424242@qq.com
            //qereqwew@163.com.cn
                           //字母数字下划线6-20位，@字母数字下划线2-10位，.com出现一次或0次，.cn出现一次或0次
            if (email.matches("\\w{6,20}@\\w{2,10}(\\.com)?(\\.cn)?")) {
                System.out.println("恭喜您，输入正确");
                break;
            }else {
                System.out.println("输入错误");
            }
        }
    }
    public static void checkPhone() {
        while (true) {
            System.out.println("请您输入电话");
            String phone = new Scanner(System.in).next();
            //43424242@qq.com


            if (phone.matches("1[3-9]\\d{9}|(0[1-9]\\d{1,4})-?[1-9]\\d{4,9}")) {
                System.out.println("恭喜您，输入正确");
                break;
            }else {
                System.out.println("输入错误");
            }
        }
    }
}
