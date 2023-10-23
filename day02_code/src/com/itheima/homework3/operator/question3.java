package com.itheima.homework3.operator;

public class question3 {
    public static void main(String[] args) {
/*        某外卖商家的菜品单价如下:
        1.鱼香肉丝每份24元,油炸花生米每份8元,米饭每份3元。
        2.优惠方式:
        总金额大于100元,总金额打9折,其它无折扣
        3.需求:
        小明购买了3分鱼香肉丝,3份花生米,5份米饭,最终需要付多少钱?*/
        int fish_falvoredpork_price = 24;
        int peanut_price = 8;
        int rice_price = 3;
        int payment1 = fish_falvoredpork_price * 3 + peanut_price * 3 + rice_price * 5 ;

        // 法一：三元运算符
        double payment = (payment1 > 100)? payment1 * 0.9 : payment1;
        System.out.println(payment);

        // 法二：if语句
        double payment2;
        if (payment1 > 100) {
            payment2 = payment1 * 0.9;

        }else{
            payment2 = payment1;
        }
        System.out.println(payment2);

    }
}
