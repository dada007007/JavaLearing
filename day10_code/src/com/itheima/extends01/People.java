package com.itheima.extends01;

public class People {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }

    protected void askQuestions() {
        System.out.println("正在问问题");

    }
}
