package com.itheima.d2_recursion;

public class RecursionTest2 {
    public static void main(String[] args) {
        // 目标：递归的算法基础：解决求阶乘。
        System.out.println("5的阶乘：" + f(5));
    }

    public static int f(int n){
        if(n == 1){
            return 1;
        }else {
            return f(n - 1) * n;
        }
    }
}
