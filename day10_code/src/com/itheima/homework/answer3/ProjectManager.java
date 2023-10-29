package com.itheima.homework.answer3;
/*1.定义项目经理类
属性：姓名 工号 工资 奖金
行为：工作work
*/
public class ProjectManager extends People{
    private int bonus;

    @Override
    public void work() {
        System.out.println("项目经理" + getName()+ "正在努力工作。。。");
    }

    public ProjectManager() {
    }

    public ProjectManager(String name, int id, int salary, int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
