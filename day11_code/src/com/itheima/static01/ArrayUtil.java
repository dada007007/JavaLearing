package com.itheima.static01;
//提供操作数组的各种方法的工具类

public class ArrayUtil {
    //私有构造方法
    private ArrayUtil() {
    }

    public static String printArr(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i] + "]";
            }else {
                str += arr[i];
            }
        }
        return str;
    }
    public static double getAverage(double[] arr){
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum/arr.length;
        return avg;
    }

}
