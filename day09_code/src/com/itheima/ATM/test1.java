package com.itheima.ATM;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入账户密码：");
            String password = sc.nextLine();

            System.out.println("请您确认账户密码：");
            String password2 = sc.nextLine();
            if(password.equals(password2)){
                System.out.println("对");
                break;
            }else {
                System.out.println("您两次输入的密码不一样，请重试");
            }
        }
    }
}
