package com.itheima.utils;

public class MathDemo {
    public static void main(String[] args) {
        //math数学类 静态类
        //1、求绝对值 int abs(int a)
        System.out.println(Math.abs(-3));
        System.out.println(Math.abs(5));
        System.out.println(Math.abs(-3.14));
        //2:向上取整 double ceil(double a)
        System.out.println(Math.ceil(1.2));
        System.out.println(Math.ceil(-1.5));
        System.out.println(Math.ceil(3.0));
        //3：向下取整double floor(double a)
        System.out.println(Math.floor(4.999));
        System.out.println(Math.floor(-1.5));
        System.out.println(Math.floor(3.0));
        //4:四舍五入 int round(float a)
        System.out.println(Math.round(3.14));
        System.out.println(Math.round(3.49));
        System.out.println(Math.round(-3.5)); //将括号内的数加0.5后，向下取整
        System.out.println(Math.round(-3.9));
        //5: 取两个数最大值 int max(int a, int b)
        System.out.println(Math.max(3, 5));
        System.out.println(Math.max(5, 3));

        //6:double pow(double a,double b) 求 a 的 b 次方
        System.out.println(Math.pow(2, 5.5));//32
        System.out.println(Math.pow(2, 10));//1024

        //7:static double random() 产生一个随机的小数 范围[0.0,1.0)
        System.out.println(Math.random());
    }
}
