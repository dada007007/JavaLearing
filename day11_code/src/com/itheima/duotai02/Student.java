package com.itheima.duotai02;

public class Student extends People{
    @Override
    public void run() {
        System.out.println("学生跑的快");
    }

    public void study(){
        System.out.println("学生在学习");
    }
}
