package com.itheima.demo4;

import java.util.List;

public class DrawMoneyThread extends Thread{
    private List<Integer> moneys;
    public DrawMoneyThread( String name, List<Integer> moneys) {
        super(name);
        this.moneys = moneys;
    }
    @Override
    public void run() {
        // 5个人一起抢钱 。
        synchronized (moneys){
            String name = Thread.currentThread().getName();
            int index = Test4.r.nextInt(moneys.size());
            System.out.println(name + "抢到了" + moneys.remove(index));
            if(moneys.size() == 0) {
                System.out.println("活动结束~~~");
            }
        }
    }
}
