package com.itheima.literal;

public class LiteralDemo {
    public static void main(String[] args) {
        //1:表达 整数 直接写
        System.out.println(666);
        System.out.println(999);
        //2.表达小数 直接写
        System.out.println(3.14);
        System.out.println(-2.6666);
        //3.表达字符 特点 使用单引号表达 引号里面 有且只有一个字符
        System.out.println('5'); // 字符5
        System.out.println('H'); // 英文字符
        System.out.println('汉'); // 中文字符
        System.out.println(' '); // 空格字符

        // 转义字符
        System.out.println('\t');// tab
        System.out.println("abcd"+'\r' +"abcd");//
        System.out.println('\n');// 换行符

        //4.表达字符串 使用双引号引起来
        System.out.println("我爱你中国");

        //5.表达布尔值 真true 假false
        System.out.println(true);
        System.out.println(false);
    }
}
