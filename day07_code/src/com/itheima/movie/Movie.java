package com.itheima.movie;

import java.sql.Array;

public class Movie {
    int[] id = {1, 2, 3};
    String[] name = {"《出拳吧，妈妈》", "《一点就到家》", "《月球陨落》"};
    String[] director = {"唐晓白", "许宏宇", "罗兰·艾默里奇"};
    String[][] actor = {{"谭卓", "田雨", "田海蓉", "陈明昊"}, {"刘昊然", "彭昱畅"}, {"哈莉·贝瑞", "帕特里克·威尔森"}};
    int[] price = {30, 40, 20};


    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public String[] getDirector() {
        return director;
    }

    public void setDirector(String[] director) {
        this.director = director;
    }

    public String[][] getActor() {
        return actor;
    }

    public void setActor(String[][] actor) {
        this.actor = actor;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }

    public int[] getId() {
        return id;
    }

    public void setId(int[] id) {
        this.id = id;
    }


    public Movie() {
    }


}
