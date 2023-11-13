package com.itheima.d6_genericity_method;

import java.util.ArrayList;

public class GenericDemo2 {
    public static void main(String[] args) {
        // 目标：理解通配符，泛型的上下限问题。
        // 需求：要求所有的汽车可以一起参与比赛。
        ArrayList<BJD> bjds = new ArrayList<>();
        bjds.add(new BJD());
        bjds.add(new BJD());
        bjds.add(new BJD());
        go(bjds);

        ArrayList<MZD> mzds = new ArrayList<>();
        mzds.add(new MZD());
        mzds.add(new MZD());
        mzds.add(new MZD());
        go(mzds);

        // 虽然BJD和MZD是Car的子类，但是  ArrayList<BJD>  ArrayList<MZD> 和 ArrayList<Car>没有半毛钱关系。
        // Java提供了一个语法：泛型通配符：其实就是“？”，可以在使用泛型的时候代表一切类型。
        // Java提供了泛型上下限，约束？的具体类型。
        //    ? extends Car : 上限： ？ 必须是Car的子类，顶多是Car
        //    ? super Car : 下限： ？ 必须是Car的父类，至少是Car

//        ArrayList<Dog> dogs = new ArrayList<>();
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//        go(dogs);
    }

    public static void go(ArrayList<? extends Car> cars){
    }
}

class Car{}
class BJD extends Car{}
class MZD extends Car{}
class Dog{}
