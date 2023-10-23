package com.itheima.homework3;

public class test1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if((j-6-i)/2<0){
                    if ((j-5+i)/2<0){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else{
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < 9; j++) {
                if((j-6-i)/2<0){
                    if ((j-5+i)/2<0){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

}
