package com.itheima.d3_collection_travesal;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest4 {
    public static void main(String[] args) {
        // 目标：理解遍历集合中的自定义对象.
        // 1、准备一个集合容器
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《肖生克的救赎》", 9.7 ,  "罗宾斯"));
        movies.add(new Movie("《霸王别姬》", 9.6 ,  "张国荣、张丰毅"));
        movies.add(new Movie("《阿甘正传》", 9.5 ,  "汤姆.汉克斯"));
        System.out.println(movies);

        // 2、遍历每个电影对象
        for (Movie movie : movies) {
            System.out.println(movie.getName());
            System.out.println(movie.getPrice());
            System.out.println(movie.getActor());
        }
    }
}
