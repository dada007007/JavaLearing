package com.itheima.d11_annotation;
@MyTest4(value = "从删库到跑路", aaa = 9.9, bbb = {"全蛋儿", "赵凯", "刘亦博"})
@MyTest1
public class Demo {

    @MyTest4(value = "从入门到坚持", bbb = {"张三", "李四"})
    public void test1(){
    }
}
