package com.itheima.d10_reflect;

import java.lang.reflect.Field;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        // 目标：掌握如果从类中获取成员变量对象。
        // 1、反射第一步：获取类的Class对象
        Class c = Student.class;

        // 2、提取这个类中全部成员变量对象。
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " " + field.getType());
        }

        // 3、定位单个成员变量
        Field sexF = c.getDeclaredField("sex");
        System.out.println(sexF.getName() + " " + sexF.getType());

        // 4、为成员变量赋值和取值。
        Student s = new Student();
        sexF.setAccessible(true); // 暴力反射
        sexF.set(s, '女');   // s.setSex('女');
        System.out.println(s);

        // 取值
        char sex = (char) sexF.get(s);
        System.out.println(sex);
    }
}
