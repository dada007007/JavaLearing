package com.itheima.method01;

//比较两个数组内部的元素是否一致
public class Demo5 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = null;
        boolean result = judgeIfsame(arr1, arr2);
        if (result) {
            System.out.println("两数组相等");
        } else {
            System.out.println("两数组不相等");
        }
    }

    public static boolean judgeIfsame(int[] arr1, int[] arr2) {

        if (arr1 == null && arr2 == null) {
            System.out.println("两数组相同，都为空数组。");
            return true;
        }
        if (arr1 == null || arr2 == null) {
            System.out.println("两数组中有一个为空数组。");
            return false;
        }
        if (arr1.length != arr2.length) {
            System.out.println("两数组长度不同");
            return false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    System.out.println("");
                    return false;
                }
            }
            return true;
        }

    }
}
