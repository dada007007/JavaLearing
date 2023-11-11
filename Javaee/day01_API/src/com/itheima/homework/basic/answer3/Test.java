package com.itheima.homework.basic.answer3;

import java.util.Scanner;

/*
键盘录入一个字符串，判断这个字符串是否为对称字符串
例如："上海自来水来自海上" , 就是一个对称的字符串
"ABCA"，就不是一个对称的字符串
*/
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要验证的字符串");
        String str = sc.next();
        check(str);
    }

    public static void check(String str){
        StringBuilder sb = new StringBuilder(str);
        if (str.equals(sb.reverse().toString())){
            System.out.println("录入的字符串为是对称的");;
        }else {
            System.out.println("录入的字符串不是对称的");
        }

    }
}
