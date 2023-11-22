package com.itheima.demo2;

import java.time.LocalDate;

/*
订单编号(id)：int类型
订单时间(time)：LocalDate类型
订单金额(money)：int类型
*/
public class Order {
    private int id;
    private LocalDate time;
    private int money;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", time=" + time +
                ", money=" + money +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Order() {
    }

    public Order(int id, LocalDate time, int money) {
        this.id = id;
        this.time = time;
        this.money = money;
    }
}
