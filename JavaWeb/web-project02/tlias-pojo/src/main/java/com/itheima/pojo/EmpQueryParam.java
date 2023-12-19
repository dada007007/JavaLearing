package com.itheima.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
//员工分页查询类（根据传入的员工名字，性别，工作起始及结束时间查询）
@Data
public class EmpQueryParam {
    private String name;//员工名字
    private Integer gender;//员工性别

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate begin;//起始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate end;//结束时间

    private Integer page = 1;//分页查询起始页码
    private Integer pageSize = 10;//分页查询每页展示条数

}
