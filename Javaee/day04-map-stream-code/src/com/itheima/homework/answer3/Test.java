package com.itheima.homework.answer3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        Scanner sc = new Scanner(System.in);

            System.out.println("请输入用户名：");
            String next = sc.next();
            System.out.println("请输入密码：");
            String next2 = sc.next();
            User user = new User(next,next2);
            users.add(user);
            User user2 = new User(next,next2);

            if(users.add(user2)){
                users.add(user2);
            }else {
                System.out.println("输入的对象重复了！");
            }

            System.out.println(users);


    }



}
