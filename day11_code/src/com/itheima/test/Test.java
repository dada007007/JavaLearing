package com.itheima.test;

public class Test {
    public static void main(String[] args) {
        Animal c = new Cat("黄", 2);
        Animal d = new Dog("黑", 3);
        Person p = new Person("红桃",18);
        p.keepPet(c,"🐟");
        p.keepPet(d,"🍦");
    }
}
