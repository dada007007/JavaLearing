package com.itheima.homework3.answer3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String reg = "\\s+"; //\\s在这里代表多个空格;   +代表多个空格
        String[] arr = str.split(reg);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {

        }
        String name = arr[0];
        int height = Integer.parseInt(arr[1]);
        int weight = Integer.parseInt(arr[2]);
        Girlfriend data = new Girlfriend(name,height,weight);
        data.show();
        data.wash();
    }
}
