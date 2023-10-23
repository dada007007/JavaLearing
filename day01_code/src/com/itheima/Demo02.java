package com.itheima;

public class Demo02 {

    public static void main(String[] args) {
        /*
           变量的应用场景
               来表达 变化的数据的时候 用变量表达
         */
        //  微信中的余额
        double money = 99.5;
        //  6点40吃饭   点了个 凉皮 8块
        money = money-8;// 支付买了一个凉皮
        //   酱香饼 5块
        money = money-5;
        System.out.println(money);
        //   碰到抢劫的
        money = money -86;
        System.out.println(money);
        // 转了一个 100块红包
        money = money+100;
        System.out.println(money);

    }
}
