package com.itheima.extends01;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("徐磊");
        t.setSkills("擦枪");
        t.print();
        System.out.println(t.getSkills().toString());
        t.askQuestions();
        Consultant c = new Consultant();
        c.setNumber(15);
        c.setName("李四");
        c.answer();
        System.out.println(t);
        System.out.println(c.toString());

    }
}
