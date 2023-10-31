package com.itheima.duotai;

public class Test {
    public static void main(String[] args) {
        Animal a = new Lv();
        listenRoar(a);
    }

    public static void listenRoar(Animal a){
        a.roar();
    }
}
