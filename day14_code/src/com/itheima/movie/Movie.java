package com.itheima.movie;

public class Movie {
    private String name;
    private String director;
    private double score;
    private int id;

    public Movie(String name, String director, double score, int id) {
        this.name = name;
        this.director = director;
        this.score = score;
        this.id = id;
    }

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
