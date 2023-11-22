package com.itheima.d10_reflect;

public class Employee {
    private String name;
    private int age;
    private String skill;
    private char sex;
    private double height;
    private String cardId;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, String skill, char sex, double height, String cardId, double salary) {
        this.name = name;
        this.age = age;
        this.skill = skill;
        this.sex = sex;
        this.height = height;
        this.cardId = cardId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
