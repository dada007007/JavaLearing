package com.itheima.controller;

import com.itheima.anno.Log;
import com.itheima.pojo.Emp;
import com.itheima.pojo.LogInfo;
import com.itheima.pojo.Result;
import com.itheima.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录Controller
 */
@Slf4j
@RestController
public class LoginController {
    @Autowired
    private EmpService empService;

    @Log
    @PostMapping("/login")
    public Result login(@RequestBody Emp emp){
        log.info("员工进行登录。。。");
        LogInfo logInfo = empService.login(emp);
        // 判断logInfo是否为空
        return logInfo != null?Result.success(logInfo):Result.error("用户名或密码错误");
    }
}
