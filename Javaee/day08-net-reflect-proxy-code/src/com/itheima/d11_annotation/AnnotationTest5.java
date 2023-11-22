package com.itheima.d11_annotation;

public class AnnotationTest5 {
    public static void main(String[] args) {
        // 拓展：Lombok结合注解实现类的代码简化
        Cat c1 = new Cat();
        c1.setName("叮当猫");
        c1.setColor("蓝色");
        c1.setSex('男');
        System.out.println(c1.getName());
        System.out.println(c1.getColor());
        System.out.println(c1.getSex());
        System.out.println(c1);

        System.out.println("--------------------------------");

        Cat c2 = new Cat("咖啡猫", "白色", '女');
        System.out.println(c2);
    }
}
