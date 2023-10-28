package com.itheima.final01;

import java.net.PortUnreachableException;

//
public class Test {
    public static void main(String[] args) {
        //3.final可以修饰变量。总规则：有且仅能赋值一次
        /*变量：
              一、局部变量
              二、成员变量
              1.静态成员变量
              2.实例成员变量
        */
    }
}
//1.final修饰类，类不能被继承了
final class A {}
// class B extends A{}

//2.final修饰方法，方法就不能被重写了
class C{
    public final     void test(){

    }
}
class D extends C{
/*    @Override
    public void test() {

    }*/
}
