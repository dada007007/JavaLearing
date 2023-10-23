package com.itheima;

public class Demo01 {

    public static void main(String[] args) {
        // 目标 学习 变量的使用
        // 什么是变量 记住程序中要处理的数据的
        //  定义格式    数据类型  变量名  =  数据;
                 //  数据 是  整数  数据类型 是   int
                 //  数据 是  小数  数据类型 是   double
                //   数据 是  字符  数据类型 是   char
                //   数据 是  字符串  数据类型是  String
                //   数据 是  布尔    数据类型是  boolean
        //  年龄的数据  表达年龄是 18
        int age = 18;
        System.out.println(age);
        // 15年前
        System.out.println(age-15);
        // 变量 特点 可以反复使用

        //没有变量   数据 10   把10 变成20
        System.out.println(20);
        System.out.println(20);
        System.out.println(20);
        System.out.println(20);
        System.out.println(20);
        System.out.println(20);
        //  设计变量之后  数据10
        int num = 20; //提高了数据的复用性 变得更加灵活
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);

        System.out.println("========变量的特点 可以发生变化的数据===========");
        int n = 100;// n 存放的100
        System.out.println(n);//结果是 100
        n = 20;
        System.out.println(n);//结果是 20

    }
}
