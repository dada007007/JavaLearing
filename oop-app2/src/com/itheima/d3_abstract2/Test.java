package com.itheima.d3_abstract2;

import com.itheima.d2_abstract.A;

public class Test {
    public static void main(String[] args) {
        // 目标：掌握抽象类的好处
        Animal a = new Cat();
        a.setName("叮当猫");
        a.cry();// 更好地支持多态
    }
}
