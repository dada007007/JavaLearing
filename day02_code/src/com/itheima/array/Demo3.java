package com.itheima.array;

public class Demo3 {
    // 强制类型转换
    public static void main(String[] args) {
        int a = 20;
        //byte b = a;
        byte b = (byte) a;
        System.out.println(b);

        int i = 1500;
        byte j = (byte) i;
        System.out.println(j); //-36

        // 抹零
        double d =135.6;
        int m =(int) d;
        System.out.println(m);



    }
}
