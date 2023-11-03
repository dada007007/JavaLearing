package com.itheima.arrays_sort2;

import java.io.PipedWriter;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayPractise {
    public static void main(String[] args) {
        Person p1 = new Person("asd", 12);
        Person p2 = new Person("qwe", 14);
        Person p3 = new Person("dfaf", 50);
        Person p4 = new Person("htgfh", 11);
        Person p5 = new Person("hgsdhf", 30);

        Person[] perArr = {p1, p2, p3, p4, p5};
        Arrays.sort(perArr, (o1, o2) -> o1.getAge() - o2.getAge());
    }
}
