package com.itheima.controller;

import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import com.itheima.service.impl.DeptServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class DeptController {
//    @GetMapping("/depts")
//    public Result list() throws Exception {
//        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("dept.txt");
//        List<String> lines = IOUtils.readLines(inputStream, "UTF-8");
//
//
//        List<Dept> deptList = lines.stream().map(line -> {
//            String[] parts = line.split(",");
//            Integer id = Integer.parseInt(parts[0]);
//            String name = parts[1];
//            LocalDateTime updateTime = LocalDateTime.parse(parts[2],
//                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//            return new Dept(id, name, updateTime);
//        }).toList();
//
//        return Result.success(deptList);

//    @Resource(name="deptServiceImpl2")
    @Autowired
    @Qualifier("deptServiceImpl2")
    private DeptService deptService; //= new DeptServiceImpl();

    @GetMapping("/depts")
    public Result list() throws IOException {
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }
}
