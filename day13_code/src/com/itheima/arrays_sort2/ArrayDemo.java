package com.itheima.arrays_sort2;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayDemo {
    public static void main(String[] args) {
        // int数组 double数组 String数组 都可以完成排序
        Person p1 = new Person("文龙", 19);
        Person p2 = new Person("文轩", 18);
        Person p3 = new Person("少龙", 21);
        Person p4 = new Person("思杰", 20);

        //新建一个数组
        Person[] perArr = {p1, p2, p3, p4};
        // 没有实现排序接口就会报错....
//        Arrays.sort(perArr);// Person不具备比较的规则 因为没有实现Comparable
        // 采用临时抱佛脚 -- 临时加一个排序的规则 不会对原有的类型造成影响
        // Arrays.sort(对象数组,自己定义一个排序规则)
        // Arrays.sort(对象数组,Comparator接口)
        // Arrays.sort(对象数组,Comparator接口的子类对象)
        // Arrays.sort(对象数组,Comparator的匿名内部类)
        // 参数要接口 要传递实现该接口 子类对象
        Arrays.sort(perArr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for (int i = 0; i < perArr.length; i++) {
            System.out.println(perArr[i]);
        }
    }
}
