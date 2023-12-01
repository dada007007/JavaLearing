package com.itheima.controller;

import com.itheima.pojo.Log;
import com.itheima.pojo.PageBean;
import com.itheima.pojo.Result;
import com.itheima.service.LogService;
import com.itheima.service.impl.LogServiceImpl;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class LogController {
    @Autowired
    private LogService logService;// = new LogServiceImpl();

    @GetMapping("/log/page")
    private Result list(){
        List<Log> logList = logService.list();
        //3. 响应结果
        return Result.success(new PageBean(10L, logList));
    }

}
