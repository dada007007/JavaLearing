package com.itheima.extends01;

public class Consultant extends People {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void answer() {
        System.out.println(getName() + "咨询师正在解答" + number + "学生的问题");
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "number=" + number +
                '}';
    }
}
