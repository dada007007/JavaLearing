package com.itheima.homework.answer1;

public class Student extends Role {
    private String className;

    public void fillForm() {
        System.out.println(getName() + "学生填写听课反馈");
    }

    public Student() {
    }

    public Student(String name, int age, String className) {
        super(name, age);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
