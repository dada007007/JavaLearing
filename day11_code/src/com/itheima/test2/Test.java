package com.itheima.test2;
/*需求：在实际开发中，经常会遇到一些数组使用的工具类。请按照如下要求编写一个数组的工具类：ArrayUtils
1、我们知道数组对象直接输出的时候是输出对象的地址的，而项目中很多地方都需要返回数组的内容，
请在ArrayUtils中提供一个工具类方法toString，用于返回整数数组的内容，
返回的字符串格式如：[10, 20, 50, 34, 100]（只考虑整数数组）
2、经常需要统计平均值，平均值为去掉最低分和最高分后的分值，请提供这样一个工具方法getAverage，
用于返回平均分。（只考虑小数类型数组）
3、定义一个测试类Test，调用该工具类的工具方法，并返回结果。*/
// Person类

// 测试类
public class Test {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 34, 100};
        System.out.println(ArrayUtils.getAverage(arr));
        System.out.println(ArrayUtils.toString(arr));
    }
}