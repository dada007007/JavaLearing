package com.itheima.homework;

class Outer {
    class Inner{
    }
}
class answer1 {
    public static void main (String[] args) {
        Outer.Inner inner = new Outer().new Inner();
    }
}
