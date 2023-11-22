package com.itheima.demo3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) throws Exception {
        File f1 = new File("mytest2-yangjinda\\src\\student-data.txt");
        List<Student> students = new ArrayList<>();
        List<Student> students1 = read(f1, students);//调用业务一方法
        Map<String, Integer> result = new HashMap<>();
        Map<String, Integer> sum = sum(students1, result);//调用业务二方法
        for (Map.Entry<String, Integer> entry : sum.entrySet()) {
            System.out.println(entry);
        }


    }
    public static List<Student> read(File f1, List<Student> students) throws Exception {
        // 业务一：存学生数据
        BufferedReader bfr = new BufferedReader(new FileReader(f1));
        String line; // 记住读取的一行数据
        while ((line = bfr.readLine()) != null) {
            String[] data = line.split(",");
            int id = Integer.valueOf(data[0]);
            String name = data[1];
            String sex = data[2];
            String dateStr = data[3];
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldt = LocalDateTime.parse(dateStr, dtf);
            String location = data[4];
            Student student = new Student(id, name, sex, ldt, location);
            students.add(student);
        }
        return students;

    }
    private static Map<String, Integer> sum(List<Student> students1, Map<String, Integer> result) {
        // 业务二：统计景点次数
        for (Student student : students1) {
                // 问问Map集合中是否存在该景点
                if (result.containsKey(student.getLocation())){
                    // 说明这个景点之前统计过,其值加1，存入到Map集合中
                    result.put(student.getLocation(),result.get(student.getLocation())+1);
                }else{
                    // 说明这个景点第一次存
                    result.put(student.getLocation(),1);
                }
        }
       return result;
    }



}
