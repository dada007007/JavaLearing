package com.itheima.breakandcontinue;
// 密码520，密码正确进入系统；密码错误的话利用死循环一直输入密码
import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        int passwd = 520;
        while (true){
            System.out.println("请输入密码： ");
            int input = new Scanner(System.in).nextInt();
            if (passwd == input){
                System.out.println("密码正确，已进入系统！");
                break;
            }else {
                System.out.println("密码错误，请重新输入。");
            }
        }
    }
}
