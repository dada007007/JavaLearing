package com.itheima.d5_interface;

public interface A {
    //成员变量（常量）
//    public static final String schoolName = "黑马程序员";
    //常量用public static final修饰没必要
    String SCHOOL_NAME = "黑马程序员";

    //成员方法(抽象方法)
//   public abstract void test();抽象方法用public abstract修饰没必要
//    void test(){}
    void test();

//    public A(){}  接口不能有构造器
//    static {}     接口也不能有静态代码块

}
