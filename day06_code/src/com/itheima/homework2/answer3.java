package com.itheima.homework2;

/*
朋友聚会的时候可能会玩一个游戏：逢七过。
规则是：从任意一个数字开始报数，当你要报的数字包含7或者是7的倍数时都要说：过。
为了帮助大家更好的玩这个游戏，这里我们直接在控制台打印出1-100之间的满足逢七必过规则的数据。
这样，大家将来在玩游戏的时候，就知道哪些数据要说：过。
请通过程序找出 1-100之间所有逢7就过的数字。
提示: for循环  if语句
*/
public class answer3 {
    public static void main(String[] args) {
        findall();
    }

    public static void findall() {
        for (int i = 0; i <= 100; i++) {
            if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                System.out.print(i + "\t");

            }
        }
    }
}
