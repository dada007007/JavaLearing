package com.itheima.d5_set;

public class SetDemo2 {
    public static void main(String[] args) {
        // 目标：拿到对象的哈希值。
        // 不同对象的哈希值，一般不同（大概率），但是也有可能相同（小概率）
        String name1 = "abc";
        System.out.println(name1.hashCode());
        System.out.println(name1.hashCode());

        String name2 = new String("aBc");
        System.out.println(name2.hashCode());
        System.out.println(name2.hashCode());
    }
}
