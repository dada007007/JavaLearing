package com.itheima.innerclass_02;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //不用匿名内部类的话要建一个狗类来继承抽象父类，从而能创建对象
        Animal a1 = new Dog();
        a1.eat();

        //局部内部类，方法里定义了一个类来新建对象再接受
        class Cat extends Animal{

            @Override
            public void eat() {
                System.out.println("猫吃肉");
            }
        }
        Animal a2 = new Cat();
        a2.eat();

        //需要得到一只动物对象
       Animal a3 = new Animal(){

           @Override
           public void eat() {
               System.out.println("动物吃肉");
           }
       };
        //看下动物对象吃什么
        a3.eat();

    }
}
