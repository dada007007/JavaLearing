package com.itheima;

public class Demo03 {

    public static void main(String[] args) {
        // 1 变量要先声明 才能使用
        //   定义 才能用
        int age = 10;//声明了一个变量
        System.out.println(age);//使用
//        System.out.println(a);//a没有声明
      // 2 变量是什么类型 就装什么数据
//        double money = "很有钱"; 不行
        double money = 99999.999;//可以
        //3: 变量是有使用范围  在它所定义的 {}中
        System.out.println(age);
        {
           int a = 10;
            System.out.println(a);
        }
//        System.out.println(a);//报错 一个变量范围是 它所属的 大括号
        //变量定义的时候 不赋值
        int aaa ;//不赋值 语法对
        //但是 使用之前必须 赋值
//        System.out.println(aaa);//报错 因为没有赋值
         aaa = 111;
        System.out.println(aaa);//不报错 因为使用前赋值了。
//        int money = 111;
    }

}
