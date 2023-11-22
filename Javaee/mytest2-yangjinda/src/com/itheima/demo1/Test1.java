package com.itheima.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*某双色球系统，红球是1-35之间的数据，篮球是1-15之间的数据，
一注双色球号码是由6个不重复的号码和1个篮球号码组成的。
功能一：请随机一组双色球号码，6个红球号码要求不重复，且升序排序输出，篮球号码放在最后面输出。
功能二：假设上图展示的是中奖号码，请用程序判断出第一个功能随机出的双色球号码中了几个红球和几个篮球。*/
public class Test1 {
    public static void main(String[] args) {
        List<Integer> num = createNum();
        System.out.println("机选号码是："+num);

        List<Integer> num2 = new ArrayList<>();
        Collections.addAll(num2,10,12,30,16,7,17,12);//创建中奖号码集合
        System.out.println("中奖号码是："+num2);

        check(num,num2);
    }

    private static void check(List<Integer> num, List<Integer> num2) {//中了几个红球和几个篮球功能。
        int count = 0;
        for (int i = 0; i < num.size()-1; i++) {//先判断红球
            int number = num.get(i);
            if (num2.contains(number)){
                count++;
            }
        }
        System.out.println("红球猜中个数为:"+count);
        if (num.get(6)==num2.get(6)){//判断最后一位蓝球
            System.out.println("蓝球猜中了，号码为："+num.get(6));
        }else {
            System.out.println("蓝球没有猜中");
        }
    }

    public static List<Integer> createNum() {//创建机选数字集合
        Random rd = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {//加入六个随机红球
            int red = rd.nextInt(35) + 1;
            if(list.contains(red)){//防止重复
                i--;
            }else {
                list.add(red);
            }
        }
        Collections.sort(list);//升序输出
        int blue = rd.nextInt(15) + 1;
        list.add(blue);     //加入蓝球
        return list;
    }
}
