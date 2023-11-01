package com.itheima.abs_01;

public class Student extends People{

    /*
    * 子类如果继承了抽象类 就需要把非具体 -- 变成具体方法
    * 称为 实现方法
    * 子类要实现抽象类的抽象方法*/



    @Override
    public void work() {
        System.out.println("学生爱学习");
    }
}
