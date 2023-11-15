package com.itheima.homework.answer6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Product, Integer> cart = new HashMap<>();

        while (true) {
            System.out.println("请输入店铺名：");
            String store = sc.next();
            System.out.println("请输入商品名：");
            String name = sc.next();
            Product c = new Product(store, name);
            if (cart.containsKey(c)) {
                cart.put(c, cart.get(c) + 1);
            } else {
                cart.put(c, 1);
            }
            System.out.println(cart);
        }
    }
}
