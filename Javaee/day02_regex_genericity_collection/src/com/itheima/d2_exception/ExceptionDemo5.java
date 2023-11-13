package com.itheima.d2_exception;

public class ExceptionDemo5 {
    public static void main(String[] args)  {
        // 目标：掌握自定义异常的定义。
        System.out.println("开始。。。");
        try {
            saveAge(234);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("结束。。。");
    }

    public static void saveAge(int age) {
        if(age <= 0 || age > 150) {
            // 出现问题：用异常表示。年龄非法异常。
            // throw : 从方法内部抛出一个异常对象。通知调用我的方法。
            throw new ItheimaAgeIllegalRuntimeException("/ age must be 1-150,your age is " + age);
        }else {
            System.out.println("成功保存您的年龄：" + age);
        }
    }
}
