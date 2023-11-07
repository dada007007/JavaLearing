package com.itheima.movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Movie> arrayList = new ArrayList<>();
        Movie m1 = new Movie("一路向西", "文龙", 7.5, 1);
        Movie m2 = new Movie("善良的小姨子", "文轩", 8.6, 2);
        Movie m3 = new Movie("邻居家的姐姐", "秋霖", 2.8, 3);
        arrayList.add(m1);
        arrayList.add(m2);
        arrayList.add(m3);
        start(arrayList);
    }

    public static void start(ArrayList<Movie> movieList) {
        System.out.println("=====电影信息系统=====");
        System.out.println("1、查询全部电影信息：");
        System.out.println("2、根据电影id查询电影详情：");
        System.out.println("3、退出系统");
        System.out.println("请您选择您要操作的功能：");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                //查询全部电影信息
                showMovie(movieList);
                start(movieList);
            case 2:
                //根据电影id查询电影详情
                showMovieByID(movieList);
                start(movieList);
            case 3:
                //退出系统
                return;
            default:
                System.out.println("您输入的指令有误，请重新输入：");
        }
    }

    public static void showMovie(ArrayList<Movie> movieList) {
        for (Movie movie : movieList) {
            System.out.println("=================");
            System.out.println(movie.getName());
            System.out.println(movie.getDirector());
            System.out.println(movie.getScore());
        }
    }

    public static void showMovieByID(ArrayList<Movie> movieList) {
        System.out.println("请输入您想查询的电影ID：");
        int id = new Scanner(System.in).nextInt();
        for (Movie movie : movieList) {
            if (movie.getId() == id) {
                System.out.println("=================");
                System.out.println(movie.getName());
                System.out.println(movie.getDirector());
                System.out.println(movie.getScore());
            }
        }
    }

}
