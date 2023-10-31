package com.itheima.test;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

/*    public void keepPet(Dog dog,String something){
        System.out.println("年龄为："+getAge()+"的饲养员"+getName()+"正在喂狗");
    }

    public void keepPet(Cat cat,String something){
        System.out.println("年龄为："+getAge()+"的饲养员"+getName()+"正在喂猫");
    }

*/
    public void keepPet(Animal a,String something){
        if (a instanceof Dog){
            Dog d = (Dog) a;
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的狗");
            d.eat(something);
        }
        if (a instanceof Cat){
            Cat c = (Cat) a;
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + c.getColor() + "颜色的" + c.getAge() + "岁的猫");
            c.eat(something);
        }
    }

}
