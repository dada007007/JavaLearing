package com.itheima.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
//分页查询班级
@Data
public class ClazzQueryParam {
    private String name;//查询班级名称

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate begin;//查询开班时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate end;//查询结课时间

    private Integer page = 1;//默认传入页码为1
    private Integer pageSize = 10;//默认每页展示数据为10条
}
