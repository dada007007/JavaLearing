package com.itheima.Oopdemo2;

public class Phone {
    String image;
    String describe;
    double price;
    String number;
    String store;

    public void show() {
        System.out.println("￥" + this.price + '\n' + describe + '\n' + number + "条评价" + '\n' + store);
    }
}
