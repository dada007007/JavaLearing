package com.itheima.d7_interface_demo;

import java.util.ArrayList;

public class StudentOperatorImpl2 implements StudentOperator {
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        int count1 = 0;
        int count2 = 0;
        System.out.println("---------全班全部信息如下：----------");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名：" + s.getName() + "，性别：" + s.getSex()
                    + "，成绩：" + s.getScore());
            if (s.getSex() == '男') {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println("全班男生人数为：" + count1 + "女生人数为：" + count2);
        System.out.println("班级总人数为：" + students.size());
        System.out.println("----------------------------------");
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double allScore = 0.0;
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (max < s.getScore()) {
                max = s.getScore();
            }
            if (min > s.getScore()) {
                min = s.getScore();
            }
            allScore += s.getScore();
        }
        System.out.println("学生的最高分是：" + max);
        System.out.println("学生的最低分是：" + min);
        System.out.println("去掉最高分和最低分后的平均分：" + ((allScore - max - min) / students.size() - 2));
    }
}
