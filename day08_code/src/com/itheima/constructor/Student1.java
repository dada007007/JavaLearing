package com.itheima.constructor;

public class Student1 {
    protected String name;
    private int age;


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public Student1() {
        System.out.println("无参构造器执行成功！");
    }
    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name + "的年龄是" + age);
    }

    public static void Name(String name, int age){
        System.out.println(name+age);
    }

}
