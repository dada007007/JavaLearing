package com.itheima.homework.basic.answer4;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
有以下double数组：
double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};
请编程计算它们的总值及平均值(四舍五入保留小数点后2位)
*/
/*
1.定义静态数组arr，并且把数组的元素存储到arr中
2.定义一个BigDecimal的变量sum，用于记录总和，初始值为0
3.遍历数组,获取数组的每一个元素
3.1 把获取到的元素通过包装类Double的toString()方法转化为字符串str
3.2 通过BigDecimal的构造方法，把str转化为BigDecimal对象 bd
3.3 使用sum加上bd，把结果重新赋值给sum
4.循环之后，sum即为总和。调用doubleValue()的方法，获取具体的值
5.计算平均值
5.1 通过Integer的toString()方法，把长度转化为一个字符串
5.2 通过BigDecimal的把长度的字符串转化为BigDecimal对象
5.3 使用sum执行divide方法，保留两位数，使用RoundindMode.HALF_UP模式
*/
public class Test {
    public static void main(String[] args) {
//        1.定义静态数组arr，并且把数组的元素存储到arr中
        double[] arr = {0.1, 0.2, 2.1, 3.2, 5.56, 7.21};
        sum(arr);
    }

    public static void sum(double[] arr) {
//        2.定义一个BigDecimal的变量sum，用于记录总和，初始值为0
        BigDecimal sum = new BigDecimal("0.0");
//        3.遍历数组,获取数组的每一个元素
        for (int i = 0; i < arr.length; i++) {
            //3.1 把获取到的元素通过包装类Double的toString()方法转化为字符串str
            String str = Double.toString(arr[i]);
            //3.2 通过BigDecimal的构造方法，把str转化为BigDecimal对象 bd
            BigDecimal bd = new BigDecimal(str);
            //3.3 使用sum加上bd，把结果重新赋值给sum
            sum = sum.add(bd);
        }
//      4.循环之后，sum即为总和。调用doubleValue()的方法，获取具体的值
        System.out.println(sum.doubleValue());
//        5.计算平均值
//        5.1 通过Integer的toString()方法，把长度转化为一个字符串
        Integer length = arr.length;
        String length1 = length.toString();
//        5.2 通过BigDecimal的把长度的字符串转化为BigDecimal对象
        BigDecimal bd = new BigDecimal(length1);
//        5.3 使用sum执行divide方法，保留两位数，使用RoundindMode.HALF_UP模式
        System.out.println(sum.divide(bd, 2, RoundingMode.HALF_UP));


    }
}
