package com.itheima.d6_interface2;

import java.lang.constant.DirectMethodHandleDesc;

public class Test {
    public static void main(String[] args) {
        //目标：搞清楚使用接口的好处
        Singer s = new A();
        s.sing();
        Driver d = new B();
        d.drive();
    }
}

class B implements Driver{

    @Override
    public void drive() {
        System.out.println("abc");
    }
}

class A extends Student implements Driver, Singer{
    @Override
    public void drive() {
        System.out.println("开车");
    }

    @Override
    public void sing() {
        System.out.println("唱歌");
    }
}

class Student{

}
interface  Driver{
    void drive();
}

interface Singer{
    void sing();
}
