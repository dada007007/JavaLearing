package com.itheima.abs_03moban;

public abstract class C {
    public final void sing(){
        System.out.println("前奏响起");

        doSing();
        System.out.println("结束");
    }

    public abstract void doSing();

}
