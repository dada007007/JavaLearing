package com.itheima.homework3.datatype;

public class question3 {
    public static void main(String[] args) {
        // 片段1
        int a = 10;
        {
            a = 20;
            System.out.println(a);
        }
        // 片段一声明变量a的代码在main方法中定义，所以不影响括号中对a的再一次赋值，所以可以正常打印

        //片段2

        int b = 20;
        System.out.println(b);

        b = 30;
        System.out.println(b);

        // 片段2 的声明b变量在括号内部，括号外的b识别不到定义的变量所以报错，
        // 解决方法：将大括号删去即可，同时为了代码规范减少一下括号中的缩进量
    }
}
