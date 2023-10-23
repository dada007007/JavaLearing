package com.itheima.movie;

//ShowAllMovieInfo类方法，实现输入电影Id后返回输出电影全部信息
public class ShowAllMovieInfo {
    public void ShowAll(){
        Movie movie = new Movie();
        int[] Id = movie.getId();
        String[] name = movie.getName();
        String[] director = movie.getDirector();
        String[][] actor = movie.getActor();
        int[] price = movie.getPrice();

        for (int i = 0; i < Id.length - 1; i++) {
            String actor1 = "";
            for (int j = 0; j < actor[i].length - 1; j++) {
                actor1 = actor1 + actor[i][j] + "，";
            }
            actor1 = actor1 + actor[i][actor[i].length - 1];
            System.out.println("电影名：" + name[i] + '\n' +
                  "导演名：" + director[i] + '\n' +
                  "演员列表：" + actor1 + '\n' +
                  "电影价格：" + price[i] + "元");
            System.out.println(actor1);
        }

    }

    public void Search(int a) {
        Movie movie = new Movie();
        int[] Id = movie.getId();
        String[] name = movie.getName();
        String[] director = movie.getDirector();
        String[][] actor = movie.getActor();
        System.out.println(actor.length);
        int[] price = movie.getPrice();
        //允许用户根据电影编号（id）查询出某个电影的详细信息。
        for (int i = 0; i < Id.length; i++) {
            if (Id[i] == a) {
                String actor2 = "";
                for (int j = 0; j < actor[i].length - 1; j++) {
                    actor2 = actor2 + actor[i][j] + "，";
                }
                actor2 = actor2 + actor[i][actor[i].length-1];
                System.out.println("电影名：" + name[i] + '\n' +
                        "导演名：" + director[i] + '\n' +
                       "演员名：" + actor2 + '\n' +
                       "电影价格：" + price[i] + "元");
                break;
            } else {
                System.out.println("您输入的电影Id不存在，请重新输入");
            }
        }

    }
}


