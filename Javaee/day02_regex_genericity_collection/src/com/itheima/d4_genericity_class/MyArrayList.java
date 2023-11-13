package com.itheima.d4_genericity_class;

import java.util.ArrayList;

public class MyArrayList<E> {
    private ArrayList list = new ArrayList();

    public boolean add(E e) {
        list.add(e);
        return true;
    }

    public void remove(E e) {
        list.remove(e);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
