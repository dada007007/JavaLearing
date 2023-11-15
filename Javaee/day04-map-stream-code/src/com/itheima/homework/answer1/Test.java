package com.itheima.homework.answer1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(1,"小亮",99);
        Student s2 = new Student(2,"小勇",85);
        Student s3 = new Student(3,"小响",90);
        Student s4 = new Student(4,"小强",89);
        List<Student> list = new ArrayList<>();
        Collections.addAll(list,s1,s2,s3,s4);
        list.sort((o1, o2) -> Double.compare(o2.getScore(),o1.getScore()));
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
