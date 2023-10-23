package com.itheima.array;
// 统计学生成绩及格的人数
public class Demo4 {
    public static void main(String[] args) {
        double[] scores = {99, 100, 62, 15, 48, 65, 98, 99, 5, 59.5, 75};
        int count = 0;
        for (double score : scores) {
            if (score >= 60) {
                count++;
            }
        }
        System.out.println(count);
    }
}
