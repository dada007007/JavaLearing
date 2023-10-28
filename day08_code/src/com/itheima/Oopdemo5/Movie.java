package com.itheima.Oopdemo5;

public class Movie {
    private int[] id = {1, 2, 3};
    private String[] name = {"《出拳吧，妈妈》", "《一点就到家》", "《月球陨落》"};
    private String[] director = {"唐晓白", "许宏宇", "罗兰·艾默里奇"};
    private String[][] actor = {{"谭卓", "田雨", "田海蓉", "陈明昊"}, {"刘昊然", "彭昱畅"}, {"哈莉·贝瑞", "帕特里克·威尔森"}};
    private int[] price = {30, 40, 20};

    public Movie() {
    }

    public Movie(int[] id, String[] name, String[] director, String[][] actor, int[] price) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.actor = actor;
        this.price = price;
    }

    public int[] getId() {
        return id;
    }

    public void setId(int[] id) {
        this.id = id;
    }

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
}
