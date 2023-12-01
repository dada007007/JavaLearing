package com.itheima.controller;

import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import com.itheima.service.impl.DeptServiceImpl;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService; //= new DeptServiceImpl();

    @GetMapping("/depts")
    public Result list2(){
        List<Dept> deptList = deptService.list2();
        //2. 响应数据
        return Result.success(deptList);
    }

}
