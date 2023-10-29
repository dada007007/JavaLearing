package com.itheima.d4_abstract_template;

public abstract class People {
    /*
    设计模板方法设计模式
    1.定义一个模板方法出来
     */

    public void write(){
        System.out.println("\t\t\t\t\t《我的爸爸》");
        System.out.println("\t\t我的爸爸好啊，牛逼啊，来看看我的爸爸有多牛");
//      2.模板方法并不清楚正文部分应该怎么写，但是它知道子类肯定要写的
        System.out.println(writeMain());
        System.out.println("有这样的爸爸真好啊！");
    }
    //3.设计一个抽象类写正文，具体的实现交给子类来实现
    public abstract String writeMain();
}
