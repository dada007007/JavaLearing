package com.itheima.homework.answer3;
/*2.定义程序员类
属性：姓名 工号 工资
行为：工作work*/

public class Coder extends People{
    public Coder() {
    }

    @Override
    public void work() {
        System.out.println("牛马程序员"+ getName() + "正在996工作。。。");
    }
}
