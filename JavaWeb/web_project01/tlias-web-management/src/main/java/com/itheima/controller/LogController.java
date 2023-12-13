package com.itheima.controller;

import com.itheima.pojo.PageBean;
import com.itheima.pojo.Result;
import com.itheima.service.LogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/log")
@RestController
@Slf4j
public class LogController {
    @Autowired
    private LogService logService;

    @GetMapping("/page")
    public Result page(@RequestParam(defaultValue = "1") Integer page ,@RequestParam(defaultValue = "10") Integer pageSize){
        log.info("分页查询：页数：{},页面容量{}", page,pageSize);
        PageBean pageBean = logService.page(page,pageSize);
        return Result.success(pageBean);
    }
}
