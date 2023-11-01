package com.itheima.interface_02;

public class XiaoYeDeng implements USB{
    @Override
    public void input() {
        System.out.println("插上了小夜灯");
    }

    @Override
    public void output() {
        System.out.println("拔出小夜灯");
    }
}
