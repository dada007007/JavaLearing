package com.itheima.homework1;
/*
    需求:
        请使用静态初始化的方式,创建一个长度为5的整数数组,并为数组中的元素赋值,
        遍历数组,在同一行打印所有元素,元素之间用空格隔开,
        比如:如果数组为{1,2,3,4,5}打印结果:1 2 3 4 5
         System.out.print() 输出数据不换行
         System.out.println() 输出数据并换行
    实现步骤:
        1.定义int数组array,并初始化
        2.使用for循环遍历数组array
        3.输出当前元素,不换行,后面拼接" "
 */
public class answer1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(" \n");
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[arr.length - 1] + "]");
    }
}
