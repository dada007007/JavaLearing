package com.itheima.extends05_test;

public class Student extends People{
    private String skill;

    public Student() {
    }

    public Student(String name, int age, String skill) {
        super(name, age);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
