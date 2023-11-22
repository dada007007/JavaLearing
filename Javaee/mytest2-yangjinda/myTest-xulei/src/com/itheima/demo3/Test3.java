package com.itheima.demo3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) throws Exception {
        // 1、定义集合存储学生对象
        List<Student> allStudents = new ArrayList<>();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 2、读取文本中的每行数据，封装一个一个的学生对象
        BufferedReader br = new BufferedReader(new FileReader("myTest-xulei\\src\\student-data.txt"));
        String line;
        while ((line = br.readLine()) != null){
            String[] names = line.split(",");
            // 3、每读取一行数据就是一个学生对象
            Student s = new Student();
            s.setId(Integer.valueOf(names[0]));
            s.setName(names[1]);
            s.setSex(names[2].charAt(0));
            s.setSelectTime(LocalDateTime.parse(names[3], dtf));
            s.setLocation(names[4]);
            // 4、学生对象存入到集合
            allStudents.add(s);
        }
        System.out.println(allStudents);

        // 5、统计每个景点想去的人数
        Map<String, Integer> info = new HashMap<>();
        for (Student student : allStudents) {
            String location = student.getLocation();
            if(info.containsKey(location)) {
                info.put(location, info.get(location) + 1);
            }else {
                info.put(location, 1);
            }
        }

        info.forEach((k,v) -> {
            System.out.println(k + "===>" + v);
        });
    }
}
