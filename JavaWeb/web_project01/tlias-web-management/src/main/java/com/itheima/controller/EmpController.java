package com.itheima.controller;

import com.itheima.pojo.*;
import com.itheima.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {
    @Autowired
    private EmpService empService;
    /*
     *//**
     * 分页查询
     *//*
    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String name, Integer gender,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end
    ) {
        log.info("分页查询：{}，{}，{}，{}，{}，{}", page, pageSize, name, gender, begin, end);
        PageBean pageBean = empService.page(page, pageSize);
        return Result.success(pageBean);

    }*/

    /**
     * 分页查询
     */
    @GetMapping
    public Result page(EmpQueryParam queryParam) {
        log.info("分页查询：{}", queryParam);
        PageBean pageBean = empService.page(queryParam);
        return Result.success(pageBean);
    }

    /**
     * 新增员工
     */
    @PostMapping
    public Result add(@RequestBody Emp emp) throws Exception {
        log.info("新增员工： {}", emp);
        empService.add(emp);
        return Result.success();
    }
/*
    *//**
     * 批量删除 - 接收参数：数组
     *//*
    @DeleteMapping
    public Result delete(Integer[] ids){
        log.info("批量删除的id是,{}", Arrays.toString(ids));
        return Result.success();
    }
    */

    /**
     * 批量删除 - 接收参数：集合
     */
    @DeleteMapping
    public Result delete(@RequestParam List<Integer> ids){
        log.info("批量删除的id是：{}", ids);
        empService.delete(ids);
        return Result.success();
    }


    /**
     * 根据Id查询员工详细信息-页面回显
     */

    @GetMapping("/{id}")
    public Result getInfo(@PathVariable Integer id){
        log.info("根据ID查询员工详细信息,id:{}",id);
        Emp emp =  empService.getInfo(id);
        return Result.success(emp);
    }

    /**
     * 修改员工信息
     */

    @PutMapping
    public Result update(@RequestBody Emp emp){
        log.info(" 修改部门 " + emp);
        empService.update(emp);
        return Result.success();
    }

    @GetMapping("/list")
    public Result getAll(){
        List<Emp> empList = empService.list();
        return Result.success(empList);
    }




}




