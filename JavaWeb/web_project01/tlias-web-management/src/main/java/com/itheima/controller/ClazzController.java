package com.itheima.controller;


import com.itheima.pojo.Clazz;
import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.ClazzService;
import com.itheima.service.impl.ClazzServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Slf4j
@RequestMapping("/clazzs")
@RestController
public class ClazzController {
    @Autowired
    private ClazzService clazzService;

    @GetMapping
    public Result list() {
        List<Clazz> clazzList = clazzService.list();
        return Result.success(clazzList);
    }

    @PostMapping
    public Result add(@RequestBody Clazz clazz){
        log.info("新增班级");
        clazzService.add(clazz);
        return Result.success();
    }




}
