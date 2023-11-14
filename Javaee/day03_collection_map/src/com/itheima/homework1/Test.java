package com.itheima.homework1;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        students.add(new Student(16,"itheima"));
        students.add(new Student(16,"itcast"));
        students.add(new Student(16,"传智播客"));

        students.forEach(System.out::println);
    }
}
