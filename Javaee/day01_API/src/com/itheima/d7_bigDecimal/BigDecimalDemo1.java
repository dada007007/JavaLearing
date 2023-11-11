package com.itheima.d7_bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        double a =0.1;
        double b =0.2;
        double c =a+b;
        System.out.println(c);

        System.out.println("--------------------------");
        // 1、把浮点型数据a包装成BigDecimal对象。
        // 得到BigDecimal对象的方案：
        // 第一种：public BigDecimal(String val)
        // 第二种：public static BigDecimal valueOf(double val)

        // BigDecimal a1 = new BigDecimal(Double.toString(a));
        BigDecimal a1 = BigDecimal.valueOf(a);

        //BigDecimal b2 = new BigDecimal(Double.toString(b));
        BigDecimal b1 = BigDecimal.valueOf(b);

        // 2、调用它的方法，得到精确的结果
        BigDecimal c1 = a1.add(b1);     //加
        BigDecimal c2 = a1.subtract(b1);    //减
        BigDecimal c3 = a1.multiply(b1);    //乘
        BigDecimal c4 = a1.divide(b1);      //除
        System.out.println(c1);
        System.out.println(c4);

        // 3、创建BigDecimal对象 实现精度控制
        BigDecimal i = new BigDecimal("0.1");
        BigDecimal j = new BigDecimal("0.3");
        /**
         * 参数一：除数
         * 参数二：保留位数
         * 参数三：舍入模式
         */
        BigDecimal k =i.divide(j,2, RoundingMode.DOWN);
        System.out.println(k);
    }
}
