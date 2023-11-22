package com.itheima.demo4;

public class getThread extends Thread {
    private Hongbao hongbao;

    public getThread(Hongbao hongbao, String name) {
        super(name);
        this.hongbao = hongbao;
    }

    @Override
    public void run() {
        hongbao.get();
    }
}
