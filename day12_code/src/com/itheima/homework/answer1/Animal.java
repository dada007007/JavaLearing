package com.itheima.homework.answer1;
/*
1、编写java程序，分析如下需求，写出你分析的类有哪些，以及功能。最后写一个测试类，针对每个类的功能进行测试。
动物园里有很多种动物：
比如说，狗，猫等。
狗有姓名和年龄，猫也有姓名和年龄。
狗有跑步的方法，猫也有跑步的方法。而且都仅仅是跑步。
狗有吃饭的方法，猫也有吃饭的方法。只不过，狗吃骨头，猫吃鱼。
请用所学知识，对这个问题进行解决。
*/
public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
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

    public abstract void eat();

    public void run() {
        System.out.println(getName() + "正在跑");
    }
}
