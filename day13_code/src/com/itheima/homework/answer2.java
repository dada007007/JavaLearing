package com.itheima.homework;

public class answer2 {
    static int total = 10;

    public static void main(String[] args) {
        new answer2();
        new answer2();
    }

    public answer2() {
        int temp = this.total;
        if (temp++ > 5) {
            System.out.println(temp);
        }
    }

}
