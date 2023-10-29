package com.itheima.homework.answer2;

/*
4.编写测试类分别对上述2类具体人物进行测试。
5.要求运行结果:
学生需要学习!
工人的工作是盖房子!*/
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.work();
        Worker w = new Worker();
        w.work();

    }
}
