package com.itheima.extends01;

public class Teacher extends People {
    private String skills;

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void print() {
        System.out.println(getName() + "老师有" + skills + "技能");
    }
    @Override
    public void askQuestions(){
        System.out.println(getName()+"正在问问题");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "skills='" + skills + '\'' +
                '}';
    }
}
