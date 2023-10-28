package com.itheima.movie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Movie movie = new Movie();
            ShowAllMovieInfo show = new ShowAllMovieInfo();
            System.out.println("==欢迎进入电影信息搜索系统==");
            System.out.println("1、展示所有电影信息");
            System.out.println("2、查询某个电影信息");
            System.out.println("请输入您想进行的操作：");
            int operator = new Scanner(System.in).nextInt();
            switch (operator){
                case 1:
                    show.ShowAll();
                    return;
                case 2:
                    System.out.println("请输入电影Id： ");
                    int Id = new Scanner(System.in).nextInt();
                    show.Search(Id);
                    String[][] actor = movie.getActor();
                    System.out.println(actor[1]);
                    return;
            }
        }

    }
}
