package com.itheima.homework.answer3;
/*1.定义项目经理类
属性：姓名 工号 工资 奖金
行为：工作work
2.定义程序员类
属性：姓名 工号 工资
行为：工作work
3.向上抽取一个父类,让这两个类都继承这个父类,共有的属性写在父类中，子类重写父类中的方法
*/
public class People {
    private String name;
    private int id;
    private int salary;

    public void work(){
        System.out.println("工作中。。。");
    }

    public People() {
    }

    public People(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
