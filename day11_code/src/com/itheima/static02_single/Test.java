package com.itheima.static02_single;

public class Test {
    public static void main(String[] args) {
        App app1 = App.getApp();
        App app2 = App.getApp();
        App app3 = App.getApp();

        System.out.println(app1);
        System.out.println(app2);
        System.out.println(app3);
    }
}
