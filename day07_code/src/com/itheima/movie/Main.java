package com.itheima.movie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        ShowAllMovieInfo show = new ShowAllMovieInfo();
        show.ShowAll();

//        System.out.println("请输入电影Id： ");
//        int Id = new Scanner(System.in).nextInt();
//        show.Search(Id);
//        String[][] actor = movie.getActor();
//        System.out.println(actor[1]);
    }
}
