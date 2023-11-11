package com.itheima.d4_stringbuilder;

public class StringBuilderTest3 {
    public static void main(String[] args) {
        // 目标：掌握StringBuilder的应用。
        int[] arr = {11, 22, 33, 23};
        String result = getArrayData(arr);
        System.out.println(result);
    }


    public static String getArrayData(int[] arr){
        if(arr == null){
            return null;
        }

        // 1、创建一个StringBuilder对象，准备拼接内容。
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        // 2、遍历这个数组中的每个数据开始拼接
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(i == arr.length - 1 ? "" : ", ");
        }

        sb.append("]");

        // 3、返回数据
        return sb.toString();
    }
}
