package com.itheima.d8_generics;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        // 目标：认识泛型
        ArrayList list = new ArrayList();
        list.add("java1");
        list.add("java2");
        list.add("java3");
/*        list.add(new Cat());*/

        for (int i = 0; i < list.size(); i++) {
            String e =(String) list.get(i);
            System.out.println(e);
        }

        System.out.println("---------------------");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("JAVA1");
        list1.add("JAVA2");
        list1.add("JAVA3");
        //list1.add(new Cat());

        for (int i = 0; i < list.size(); i++) {
            String e = list1.get(i);
            System.out.println(e);
        }

    }
}
class Cat{

}
