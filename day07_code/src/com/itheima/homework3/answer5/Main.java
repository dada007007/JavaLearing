package com.itheima.homework3.answer5;

/*
1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，set和get方法
2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
3.调用成员方法,打印格式如下:
工号为888基本工资为15000奖金为6000的项目经理张三正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
工号为666基本工资为10000的程序员李四正在努力的写着代码......
*/
public class Main {
    public static void main(String[] args) {
        ProjectManager zhangsan = new ProjectManager("张三", 888, 15000, 6000);
        zhangsan.work();
        Coder lisi = new Coder("李四",666,10000);
        lisi.work();
    }
}
