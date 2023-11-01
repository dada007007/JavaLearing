package com.itheima.interface_02;

public class UPan implements USB{

    @Override
    public void input() {
        System.out.println("U盘插入电脑");
    }

    @Override
    public void output() {
        System.out.println("U盘拔出电脑");
    }
}
