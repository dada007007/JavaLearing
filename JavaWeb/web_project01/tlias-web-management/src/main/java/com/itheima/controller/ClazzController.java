package com.itheima.controller;


import com.itheima.pojo.*;
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

    @GetMapping("/list")
    public Result list() {
        List<Clazz> clazzList = clazzService.list();
        return Result.success(clazzList);
    }

    /**
     * 班级分页查询
     */
    @GetMapping
    public Result page(ClazzQueryParam queryParam) {
        log.info("分页查询：{}", queryParam);
        PageBean pageBean = clazzService.page(queryParam);
        return Result.success(pageBean);
    }

    /**
     * 删除班级
     */

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除的班级：{}",id);
        clazzService.delete(id);
        return Result.success();
    }

    /**
     * 新增班级
     */
    @PostMapping
    public Result add(@RequestBody Clazz clazz){
        log.info("新增班级");
        clazzService.add(clazz);
        return Result.success();
    }

    /**
     * 根据id查询班级
     */
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        log.info("查询班级:{}",id);
        Clazz clazz = clazzService.getById(id);
        return Result.success(clazz);
    }

    /**
     * 修改班级
     */
    @PutMapping
    public Result update(@RequestBody Clazz clazz){
        log.info("修改班级的信息,{}",clazz);
        clazzService.update(clazz);
        return Result.success();
    }

}
