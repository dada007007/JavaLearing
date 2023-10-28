package com.itheima.string.Yanzhengma2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("请输入您想要的验证码位数：");
        Scanner sc = new Scanner(System.in);
        Checkcode2 code = new Checkcode2();
        while (true) {
            int a = sc.nextInt();
            if(a > 1){
                System.out.println(code.code(a));
                return;
            }else{
                System.out.println("您输入的验证码位数有问题，请重新输入：");
            }
        }
    }
}