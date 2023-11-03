package com.itheima.homework;
abstract class Animal{
    public abstract void show();
}
class Dog extends Animal{
    public  void show(){
        System.out.println("汪汪汪");
    }
}


class answer3 {

    public static void main(String[] args){

        //请用子类的形式调用
        fun(new Dog());
        //请用匿名内部类的形式调用
        Animal a1 = new Animal() {
            @Override
            public void show() {
                System.out.println("汪汪汪");
            }
        };

    }

    public static void fun(Animal a ){
        a.show();
    }

}