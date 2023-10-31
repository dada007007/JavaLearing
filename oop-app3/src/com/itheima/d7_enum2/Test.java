package com.itheima.d7_enum2;

public class Test {


    public static void main(String[] args) {
        // 目标：掌握枚举的应用场景：做信息标志和分类。
//        check(1);
//        check(Constant.BOY);

        check(Constant2.BOY);
    }


    public static void check(Constant2 sex) {
        switch (sex) {
            case BOY:
                System.out.println("展示一些美女图片，游戏信息~~");
                break;
            case GIRL:
                System.out.println("展示一些帅哥图，一些土豪信息~~");
                break;
        }
    }
//    public static void check(int sex) {
//        switch (sex) {
//            case Constant.BOY:
//                System.out.println("展示一些美女图片，游戏信息~~");
//                break;
//            case Constant.GIRL:
//                System.out.println("展示一些帅哥图，一些土豪信息~~");
//                break;
//        }
//    }
}

