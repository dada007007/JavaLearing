package com.itheima.d4_genericity_class;

import java.util.ArrayList;

public class GenericDemo1 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Java1");
        list.add("Java2");
        list.add("Java3");
        list.add("Java4");
        list.add("Java5");
        System.out.println(list);

        list.remove("Java3");
        list.remove("Java4");
        System.out.println(list);

    }
}
