package com.itheima.static02_single;

public class App {
    private static App app = new App();

    //1.构造私有化，不让new对象
    private App(){};

    public static App getApp(){
        return app;
    }
}
