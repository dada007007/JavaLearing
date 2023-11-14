package com.itheima.d5_set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        // 目标: 理解HashSet集合去重复.
        /**
         * Set去重复的原理：
         *      首先会判断对象的哈希值，算出到某个位置，如果这个位置有数据，再判断两个对象的equals是否一样，如果一样就认为重复的！
         */
//        Set<Student> sets = new HashSet<>(); // 无序,不重复,无索引
//        Student s1 = new Student("张继科",'男', "借钱" );
//        Student s2 = new Student("林丹",'男', "打球" );
//        Student s3 = new Student("景甜",'女', "从前的张继科" );
//        Student s4 = new Student("景甜",'女', "从前的张继科" );
//        sets.add(s1);
//        sets.add(s2);
//        sets.add(s3);
//        sets.add(s4);
//        System.out.println(s3.hashCode());
//        System.out.println(s4.hashCode());
//        System.out.println(sets);

    }

}
