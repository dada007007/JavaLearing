package com.itheima.string.Yanzhengma;
//需求：
//实现随机产生验证码，验证码的每位可能是数字、大写字母、小写字母。
// 分析：
// 设计一个方法，该方法接收一个整型参数，最终要返回对应位数的随机验证码。
// 方法内定义2个字符串变量：1个用来记住生成的验证码，1个用来记住要用到的全部字符。

// 定义for循环控制生成多少位随机字符，每次得到一个字符范围内的随机索引，
// 根据索引提取该字符，把该字符交给code变量连接起来，循环结束后，在循环外返回code即可。
// 主程序中，调用该方法即可得到随机验证码了。

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        CheckCode code = new CheckCode();
        System.out.println("请输入生成验证码的位数：");
        int a = new Scanner(System.in).nextInt();
        String code1 = code.code(a);
        System.out.println(code1);
        System.out.println(code1.length());
    }
}
