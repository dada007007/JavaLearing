package com.itheima.controller;

import com.itheima.pojo.PageBean;
import com.itheima.pojo.Result;
import com.itheima.pojo.Stu;
import com.itheima.pojo.StuQueryParam;
import com.itheima.service.StuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/students")
public class StuController {
    @Autowired
    private StuService stuService;

    /**
     * 学员列表数据的条件分页查询
     */
    @GetMapping
    public Result page(StuQueryParam stuQueryParam){
        log.info("分页参数：{}",stuQueryParam);
        PageBean pageBean = stuService.page(stuQueryParam);
        return Result.success(pageBean);
    }

    /**
     * 批量删除学员信息
     */
    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids){
        log.info("批量删除的id是：{}", ids);
        stuService.delete(ids);
        return Result.success();
    }

    /**
     * 添加学员信息
     */
    @PostMapping
    public Result add(@RequestBody Stu stu){
        log.info("新增员工： {}", stu);
        stuService.add(stu);
        return Result.success();
    }

    /**
     * 页面回显，根据主键ID查询学员的信息
     */
    @GetMapping("/{id}")
    public Result findById(@PathVariable Integer id){
        log.info("学员id信息：{}",id);
        Stu stu = stuService.findById(id);
        return Result.success(stu);
    }

    /**
     * 修改学员的数据信息
     */
    @PutMapping
    public Result update(@RequestBody Stu stu){
        log.info("修改学员的信息,{}",stu);
        stuService.update(stu);
        return Result.success();

    }
    /**
     * 违纪处理，修改学员的数据信息
     */
    @PutMapping("/violation/{id}/{score}")
    public Result updateViolation(@PathVariable Integer id,@PathVariable Integer score){
        stuService.updateViolation(id,score);
        return Result.success();
    }


}
