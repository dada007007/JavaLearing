package com.itheima.homework3.operator;

public class question2 {
    public static void main(String[] args) {
//        运行效果:
//        1234的个位是4,十位是3,百位是2,千位是1
        int a = 1234;
        int b = a % 10;
        int c = a % 100 / 10;
        int d = a % 1000 / 100;
        int e = a / 1000 ;
        System.out.println("1234的个位是"+ b +",十位是"
                            + c +",百位是"
                            + d +",千位是"
                            + e);

    }
}
