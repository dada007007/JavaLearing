package com.itheima;
import java.util.Random;
public class RandomDemo {
    public static void main(String[] args) {
        Random ran = new Random();
        int i = ran.nextInt(0, 1);
        System.out.println(i);
    }
}
