package com.itheima.homework.answer1;

public class Teacher extends Role{
    private String deptName;

    public void publishForm(){
        System.out.println(getName()+"老师正在发布问题");
    }

    public Teacher() {
    }

    public Teacher(String name, int age, String deptName) {
        super(name, age);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
