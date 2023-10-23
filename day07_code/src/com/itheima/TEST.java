package com.itheima;

public class TEST {
    public static void main(String[] args) {
        char[] chs = {'h','e','l','l','o'};
        String s = new String(chs);
        String t = new String(chs);
        String h = new String("hello");
        String e = "hello";
        String f = "hello";
        System.out.println(s.equals(t));
        System.out.println(t.equals(e));
        System.out.println(s == t);
        System.out.println(e == f);
        System.out.println(s.equals(h));
        System.out.println(s == h);
        System.out.println(h == e);
    }
}
