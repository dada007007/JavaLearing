package com.itheima.d3_integer;

public class IntegerDemo1 {
    public static void main(String[] args) {
        // 目标：认识包装类，再搞清楚他的应用场景。
        // 1、基本作用：可以基本类型的对象化。
        Integer it = 12; // 自动装箱：可以把基本类型的数据直接转换成对象给包装类型的变量记住

        int it2 = 35;
        Integer it3 = it2; // 自动装箱
        System.out.println(it3);

        int it4 = it3; // 自动拆箱：可以把包装类型的变量直接赋值给基本类型的变量。
        System.out.println(it4);

        // 包装类的特点：可以接收默认值null，除此之外包装类还多了很多功能
        Integer i = null;
        Integer i2 = 0;
        Integer i3 = 232;
        int i4 = 0;

        System.out.println("----------------------------------------------");

        // a、包装类可以把基本类型的数据变成字符串。
        int a = 23;
        String aStr = Integer.toString(a);  // "23"
        System.out.println(aStr + 1);

        Integer a2 = 23;
        String a2Str = a2.toString();
        System.out.println(a2Str + 1);

        int a3 = 23;
        String a3Str = a3 + ""; // "23"
        System.out.println(a3Str + 1);

        // b、包装类也可以把字符串类型的数值转换成对应的基本数据类型参与运算。（真的很有用）
        String s1 = "99";
        // int t1 = Integer.parseInt(s1);
        int t1 = Integer.valueOf(s1);
        System.out.println(t1 + 1);

        String s2 = "23.5";
        // double t2 = Double.parseDouble(s2);
        double t2 = Double.valueOf(s2);
        System.out.println(t2 + 0.5);
    }
}
