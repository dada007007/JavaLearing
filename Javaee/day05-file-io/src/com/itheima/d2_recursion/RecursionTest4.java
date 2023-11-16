package com.itheima.d2_recursion;

public class RecursionTest4 {
    public static void main(String[] args) {
        // 目标：猴子吃桃问题
        // 公式： f(x + 1) = f(x) - f(x)/2 - 1
        //       2f(x + 1) = 2f(x) - f(x) - 2
        //       f(x) = 2f(x + 1) + 2
        // 终结点：
        //      f(10) = 1
        // 递归的方向：
        //      f(1) = ?
        System.out.println(f(1));
        System.out.println(f(2));
        System.out.println(f(3));
    }

    public static int f(int x){
        if(x == 10){
            return 1;
        }
        return 2 * f(x + 1) + 2;
    }
}
