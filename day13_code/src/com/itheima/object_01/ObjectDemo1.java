package com.itheima.object_01;

public class ObjectDemo1 {
    public static void main(String[] args) {
            /*
      Object中的 toString方法
         Object是Student的父类
           Student就具备了Object定义的功能
            public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
                       当前对象的包名+类名       @   16进制数据(地址值)
                        com.itheima.object_01.Student@
            }
     */

        Student stu = new Student("小迪迪",18);

        System.out.println(stu.toString());// com.itheima.object_01.Student@3b07d329
        // 重写之后  Student{name='小迪迪', age=19}
        System.out.println(stu);//其实调用的是 stu.toString()
        // Student中定义 toString了吗
        // 没有 为什么能调用 因为有父类 父类中有
        // toString 设计目的是什么？ 返回对象的样子--->默认的样子是一个地址值
        //  不够高级 ---所以我们在开发中都会重写 toString方法
        // 目的 展示 子类所具备的属性  怎么重写 快捷键
        //  快捷键的重写 拼接字符串 里面拼接的是  子类的属性
    }
}
