package com.itheima.duotai02;

public class Teacher extends People{
    @Override
    public void run() {
        System.out.println("老师跑的比较慢");
    }

    public void teach(){
        System.out.println("老师教授Java");
    }
}
