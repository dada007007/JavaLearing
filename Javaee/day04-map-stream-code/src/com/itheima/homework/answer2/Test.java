package com.itheima.homework.answer2;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Integer> red =new HashSet<>();
        Random rd = new Random();
        while (red.size()<6){
            red.add(rd.nextInt(33)+1);
        }
        System.out.println(red);
        List<Integer> all = new ArrayList<>();
        for (Integer integer : red) {
            all.add(integer);
        }
        all.sort(((o1, o2) -> o1-o2));
        all.add(rd.nextInt(16)+1);
        System.out.println(all);
    }
}
