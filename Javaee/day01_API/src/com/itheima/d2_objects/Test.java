package com.itheima.d2_objects;

import com.itheima.d1_object.Student;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        // 目标：掌握Objects类提供的常用方法。
        String name1 = null;
        String name2 = "西门吹牛";
        // System.out.println(name1.equals(name2));

        // 使用上面：Objects的equals方法更加的安全可靠，可以避免空指针异常,还能给正常的结果
        // 原因：多了一个非空校验，必须不是null,才会比较内容
        System.out.println(Objects.equals(name1, name2));

        // 判断对象是否是null
        System.out.println(Objects.isNull(name1)); // true
        System.out.println(name1 == null); // true

        // 判断对象是否不是null
        System.out.println(Objects.nonNull(name2)); // true
        System.out.println(name2 != null); // true
    }
}
