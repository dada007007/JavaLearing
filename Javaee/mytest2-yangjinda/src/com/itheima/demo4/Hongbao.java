package com.itheima.demo4;

import java.util.Arrays;
import java.util.Random;

public class Hongbao {
    private int[] money;

    public Hongbao() {
    }

    public int[] getMoney() {
        return money;
    }

    public void setMoney(int[] money) {
        this.money = money;
    }

    public Hongbao(int[] money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Hongbao{" +
                "money=" + Arrays.toString(money) +
                '}';
    }

    public void get() {
        Random rd = new Random();
        String name = Thread.currentThread().getName();
        while (this.money.length > 0) {
            int i1 = this.getMoney().length;
            int i = rd.nextInt(this.money.length);
            synchronized (this) {
                if (i1 != 0) {
                    System.out.println(name + this.money[i]);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }
}
