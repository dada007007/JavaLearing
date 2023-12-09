package com.itheima.controller;

import com.itheima.pojo.Customer;
import com.itheima.pojo.CustomerQueryParam;
import com.itheima.pojo.PageBean;
import com.itheima.pojo.Result;
import com.itheima.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
@Slf4j
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    /**
     * 客户分页查询
     */
    @GetMapping
    public Result page(CustomerQueryParam customerQueryParam){
        PageBean pageBean = customerService.page(customerQueryParam);
        return Result.success(pageBean);
    }

    /**
     * 添加客户
     */
    @PostMapping
    public Result add(@RequestBody Customer customer){
        customerService.add(customer);
        return Result.success();
    }

    /**
     * 根据id查询
     */
    @GetMapping("/{id}")
    public Result findByID(@PathVariable Integer id){
        Customer customer = customerService.findByID(id);
        return Result.success(customer);
    }

    /**
     * 修改客户
     */
    @PutMapping
    public Result update(@RequestBody Customer customer){
        customerService.update(customer);
        return Result.success();
    }

    /**
     * 删除客户
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        customerService.delete(id);
        return Result.success();
    }
}
