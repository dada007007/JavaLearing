package com.itheima.abs_01;

public abstract class People {

    public void sleep(){
        System.out.println("人在床上睡");
    }

    /*
    * 因为在这里，具体的人做具体的事
    * 当前并不知道 具体的是什么工种
    * 无法写出具体的工作  ----使用抽象来表达方法*/
/*    public void work(){
        System.out.println("学生~~学习");
        System.out.println("老师~~教课");
        System.out.println("司机~~开车");
        System.out.println("护士~~打针");
    }*/



    public abstract void work();
}
