package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("枸杞");
        arrayList1.add("印度枸杞");
        arrayList1.add("枸杞子");
        arrayList1.add("高洪涛喝枸杞");
        arrayList1.add("黑马程序员都爱喝枸杞");
        arrayList1.add(2,"wqeas");
        System.out.println(arrayList1);

        arrayList1.remove("枸杞");
        System.out.println(arrayList1);

        System.out.println(arrayList1.get(3));

        System.out.println(arrayList1);
        arrayList1.set(2,"嗨000");

        System.out.println(arrayList1);
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }

        System.out.println(arrayList1);
        for (int i =  arrayList1.size() - 1; i >= 0; i--) {
            if(arrayList1.get(i).contains("枸杞")){
                arrayList1.remove(i);
            }
        }
        System.out.println(arrayList1);

    }
}
