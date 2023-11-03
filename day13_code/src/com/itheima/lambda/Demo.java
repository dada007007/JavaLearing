package com.itheima.lambda;

public class Demo {
    public static void main(String[] args) {
        //正常用匿名内部类重写接口Swim下的swimming方法
        goSwimming(new Swim() {
            @Override
            public void swimming() {
                System.out.println("去游泳");
            }
        });

        //使用lambda表达式简化后的结果
        goSwimming(() -> {
                    System.out.println("去游泳");
                }
        );

        //使用简化lambda表达式后的结果
        goSwimming(() -> System.out.println("去游泳"));
    }

    public static void goSwimming(Swim swim) {
        System.out.println("去海边");
        swim.swimming();
        System.out.println("回家");
    }
}
