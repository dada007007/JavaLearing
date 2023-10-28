package com.itheima.Oopdemo5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        start();        //主界面
    }

    public static void start() {
        Movie movie = new Movie();
        int[] id = movie.getId();
        String[] name = movie.getName();
        String[] director = movie.getDirector();
        String[][] actor = movie.getActor();
        int[] price = movie.getPrice();
        Scanner sc = new Scanner(System.in);
        while (true) {//while死循环进行界面的轮回
            System.out.println("===欢迎进入电影查询系统===");
            System.out.println("1.查询所有电影的信息");
            System.out.println("2.通过id查询电影信息");
            System.out.println("3.退出");
            int choice = sc.nextInt();
            switch (choice) {//通过输入选项进行对电影信息的操作
                case 1://显示所有电影的信息
                    showall(id, name, director, actor, price);
                case 2://输入id
                    search(id, name, director, actor, price);
                case 3://退出操作
                    System.out.println("您已成功退出系统！");
                    return;
                default://其他刁民选项，输出
                    System.out.println("您输入的查询操作有误，请重新输入！");
                    break;//break跳出switch循环，回到while中继续界面循环
            }
        }
    }

    public static void showall(int[] id, String[] name, String[] director, String[][] actor, int[] price) {
        //展示所有电影功能
        System.out.println("========================");
        for (int i = 0; i < id.length; i++) {//遍历id数组
            StringBuilder actor1 = new StringBuilder();
            for (int j = 0; j < actor[i].length - 1; j++) {
                actor1.append(actor[i][j]).append("，");    //要第i个电影对应下的所有演员拼接成一个字符串
            }
            actor1.append(actor[i][actor[i].length - 1]);
            System.out.println("电影名：" + name[i] + '\n' +
                    "导演名：" + director[i] + '\n' +
                    "演员列表：" + actor1 + '\n' +
                    "电影价格：" + price[i] + "元");
            System.out.println("========================");
        }
    }

    public static void search(int[] id, String[] name, String[] director, String[][] actor, int[] price) {
        //输入指定电影id，查询该id的电影信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想查询的电影id");
        while (true) {
            int choice = sc.nextInt();
            System.out.println("========================");
            if (choice <= id.length && choice > 0) {
                for (int i = 0; i < id.length; i++) {
                    if (choice == i + 1) {              //如果输入的数值和索引加1相等，则证明是要找的actor[i][j]的i索引
                        String actor1 = "";
                        for (int j = 0; j < actor[i].length - 1; j++) {    //要第i个电影对应下的所有演员拼接成一个字符串
                            actor1 = actor1 + actor[i][j] + "，";
                        }
                        actor1 = actor1 + actor[i][actor[i].length - 1];
                        System.out.println("电影名：" + name[i] + '\n' +
                                "导演名：" + director[i] + '\n' +
                                "演员列表：" + actor1 + '\n' +
                                "电影价格：" + price[i] + "元");
                        System.out.println("========================");
                        return;
                    }
                }
            } else {
                System.out.println("您输入的电影id不存在，请重新输入");
            }
        }
    }
}
