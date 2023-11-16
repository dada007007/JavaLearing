package com.itheima.d2_recursion;

public class RecursionTest1 {
    public static void main(String[] args) {
        // 目标：认识递归的形式。
         // test1();
        // test2();
    }

    public static void test2(){
        System.out.println("===test2===");
        test3();
    }

    public static void test3(){
        System.out.println("===test3===");
        test2();
    }


    public static void test1(){
        System.out.println("==test1==");
        test1(); // 直接递归：自己调用自己
    }
}
