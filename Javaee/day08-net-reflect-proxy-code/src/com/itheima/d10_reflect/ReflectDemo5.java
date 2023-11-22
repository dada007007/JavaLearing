package com.itheima.d10_reflect;

public class ReflectDemo5 {
    public static void main(String[] args) throws Exception {
        // 目标：体会反射设计通用框架的思想。
        Pig pig = new Pig("佩奇", "粉色pink", '女');
        Test.saveObject(pig);

        Employee employee = new Employee("赵凯", 22, "Java，前端"
                , '男', 190.5, "003197", 16000);
        Test.saveObject(employee);

    }
}
