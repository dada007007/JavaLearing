package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        int num = new Random().nextInt(1,101);
        System.out.println(num);
        while (true){
            System.out.println("请输入您猜测的数字： ");
            int input = new Scanner(System.in).nextInt();
            if (input > num){
                System.out.println("您猜的数字过大，请继续猜测;");
            }else if(input < num){
                System.out.println("您猜的数字过小，请继续猜测：");
            }else {
                System.out.println("恭喜您猜对了");
                break;
            }
        }
    }
}
