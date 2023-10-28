package com.itheima.string.Login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        System.out.println("请输入您账户的用户名");
        String input1 = new Scanner(System.in).next();
        System.out.println("请输入您账户的密码");
        String input2 = new Scanner(System.in).next();
        login.check(input1, input2);
    }
}
