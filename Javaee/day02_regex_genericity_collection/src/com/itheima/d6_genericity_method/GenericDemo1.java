package com.itheima.d6_genericity_method;

public class GenericDemo1 {
    public static void main(String[] args) {
        // 目标：认识泛型方法。
        // 需求：提供一个方法，可以打印任意对象数组的内容。
        Integer[] arr1 = {11, 223, 243};
        printArray(arr1);

        String[] names = {"王宝强", "贾乃亮", "陈羽凡"};
        printArray(names);

        // 避免返回值的强转问题
        Integer max = getMax(arr1);
        String max2 = getMax(names);


    }

    public static <T> void printArray(T[] arr){

    }

    public static <T> T getMax(T[] arr){
        return null;
    }
}
