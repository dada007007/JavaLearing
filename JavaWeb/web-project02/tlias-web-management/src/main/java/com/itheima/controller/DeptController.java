package com.itheima.controller;

import com.itheima.anno.Log;
import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
@Slf4j
@RequestMapping("/depts")
@RestController
public class DeptController {
    //    @Resource(name="deptServiceImpl2")
    @Autowired
    private DeptService deptService; //= new DeptServiceImpl();

    //    查询部门
    @GetMapping
    public Result list() throws IOException {
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    //    根据ID删除部门 方法一： 原始 HttpServletRequest 对象获取（少用）
/*
    @DeleteMapping("/depts")
    public Result delete(HttpServletRequest request) {
        System.out.println("根据ID删除部门");
        String id = request.getParameter("id");
        int _id = Integer.parseInt(id);
        System.out.println("根据ID删除部门 ： " + _id);

        return Result.success();
    }
*/
    /**
     *  根据ID删除部门 - 请求参数获取 - 方法二：@RequestParam注解绑定请求参数到方法形参
     *
     *  场景：前端传递参数名与controller方法形参不一致
     */

//    @DeleteMapping("/depts")
//    public Result delete(@RequestParam(name = "id") Integer _id) {
//        System.out.println("根据ID删除部门 ： " + _id);
//        return Result.success();
//    }

    /**
     * 根据ID删除部门 方法三：前端传递参数名与controller方法形参名一致，省略@RequestParam（推荐的方式）
     * <p>
     * 场景：前端传递参数名与controller方法形参一致
     */
    @Log
    @DeleteMapping
    public Result delete(@RequestParam(name = "id", required = false) Integer id) {
        log.info("被删除的部门id是：" + id);
        deptService.delete(id);
        return Result.success();
    }

    /**
     * 新增部门
     * {"name":"..." }
     */
    @Log
    @PostMapping
    public Result add(@RequestBody Dept dept) {
        log.info("新增部门" + dept);
        deptService.add(dept);
        return Result.success();
    }

    /**
     *  页面回显，id查询部门
     */

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        log.info("根据id查询部门：" + id);
        Dept dept = deptService.getById(id);
        return Result.success(dept);
    }

    /**
     * 修改部门
     */
    @Log
    @PutMapping
    public Result update(@RequestBody Dept dept) {
        log.info(" 修改部门 " + dept);
        deptService.update(dept);
        return Result.success();
    }

}
