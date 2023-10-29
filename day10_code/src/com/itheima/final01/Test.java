package com.itheima.final01;

import java.net.PortUnreachableException;

//
public class Test {
    /*
    * 常量： public static final修饰的成员变量，建议名称全部大写，多个单词都大写
    */
//    public static final String schoolName;
    public static final String SCHOOL_NAME="黑马";
//    schoolName = "白马";

    private final String NAME = "猪八戒";


    public static void main(String[] args) {
        //3.final可以修饰变量。总规则：有且仅能赋值一次
        /*变量：
              一、局部变量
              二、成员变量
              1.静态成员变量
              2.实例成员变量
        */
        final int a;
        a = 12;
        // a = 13;     // 第二次赋值，出错

        final double r = 3.14; //例如圆周率等固定、不想被改变的值
        //r = 0.1;

        final int[] arr = {11,22,33}; //数组final修饰固定的是地址值
//        arr = null;// 第二次赋值，出错
        arr[1] = 222;

//        Test t = new Test();
//        t.NAME = "孙悟空"; //二次赋值出错

    }

    public  static void buy(final double z){
        //z = 0.1; //第二次赋值，出错了
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
