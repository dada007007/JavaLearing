package com.itheima.d9_generics_class;

public class Test {
    public static void main(String[] args) {
        // 目标：掌握泛型类的定义和使用。
        MyArrayList<String> list = new MyArrayList<String>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        System.out.println(list.get(2));

        MyClass2<Cat, String> c2 = new MyClass2<>();
        c2.put(new Cat(),"");

        MyClass3<Dog> c3 = new MyClass3<>();
        c3.put(new Dog());
    }
}
