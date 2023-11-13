package com.itheima.d3_genericity;

import java.util.ArrayList;

public class GenericDemo1 {
    public static void main(String[] args) {
        // 目标：认识泛型。
        ArrayList<String> list = new ArrayList<String>();
//        list.add(12);
//        list.add(12.4);
//        list.add(false);
//        list.add('a');
        list.add("楚留香");
        list.add("石观音");
        System.out.println(list);

//        ArrayList list2 = list;
//        list2.add(9.9);
//        System.out.println(list2);

        for (int i = 0; i < list.size(); i++) {
            String result = list.get(i);
            System.out.println(result);
        }
    }
}
