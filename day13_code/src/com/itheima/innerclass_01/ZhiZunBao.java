package com.itheima.innerclass_01;

public class ZhiZunBao {
    // 属性
    private String wife = "白晶晶";
    private int age = 30;

    //成员方法
    public void tiaoYa() {
        System.out.println("我爱紫霞");
        System.out.println("我爱白晶晶");
    }

    //有心脏的 心脏会说话--事物--用类来表达
    public class Heart {//内部类
        //可以有成员变量
        private String lover = "紫霞仙子";
        private int age = 500;

        //成员方法
        public void speak() {
            System.out.println("你好。。");
            System.out.println("你最爱的是谁" + lover);
            //访问 外部类的成员
            System.out.println("你的老婆是谁" + wife);
            tiaoYa();
            //访问心脏的年龄
            System.out.println("心脏的年龄:"+age);
            //访问至尊宝的年龄
            System.out.println("至尊宝的年龄:"+ZhiZunBao.this.age);

        }
    }

}
