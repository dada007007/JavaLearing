package com.itheima.d2_inner_class2;

public class Outer {
    private int age;
    public static String schoolName;
    //静态内部类
    public static class Inner{
        private String name;
        public static int a;

        public void test(){
            System.out.println(schoolName);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static int getA() {
            return a;
        }

        public static void setA(int a) {
            Inner.a = a;
        }
    }
    public static void test2(){
        System.out.println(schoolName);
    }
}
