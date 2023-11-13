package com.itheima.d2_exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        // 目标：理解异常的作用。
        System.out.println("开始。。。");
        try {
            divide(10,0);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("结束。。。");
    }

    public static void divide(int a, int b){
        if(b == 0){
            throw new RuntimeException("您输入的除数不能为0");
        }
        int c = a / b;
        System.out.println("结果是：" + c);
    }
}
