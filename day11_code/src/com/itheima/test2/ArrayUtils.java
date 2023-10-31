package com.itheima.test2;
// 方法类
public class ArrayUtils {
    //构造器私有化
    private ArrayUtils() {
    }
    //定义静态类方法toString
    public static String toString(int[] arr) {
        String str = "[";

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                str += arr[i] + ", ";
            } else {
                str += arr[i] + "]";
            }
        }
        return str;
    }
    //定义静态类方法getAverage
    public static double getAverage(int[] arr) {
        double ave = 0.0;
        for (int i = 0; i < arr.length; i++) {
            ave += arr[i];
        }
        ave = ave / arr.length;
        return ave;
    }
}
