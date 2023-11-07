package com.itheima.d3_exception;

import java.text.SimpleDateFormat;

public class ExceptionTest1 {
    public static void main(String[] args) {
//        Integer.valueOf("abc");

        int[] arr = {11,22,33};
        System.out.println(arr[5]);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        sdf.parse("2028-11-11 10:24:28");

    }
}
