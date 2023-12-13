package com.itheima.controller;

import com.itheima.pojo.JobOption;
import com.itheima.pojo.Result;
import com.itheima.pojo.StuNum;
import com.itheima.service.ReportService;
import com.itheima.service.impl.ReportServiceImpl;
import jakarta.servlet.http.PushBuilder;
import jdk.jfr.Frequency;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 报表统计Controller
 */
@Slf4j
@RestController
@RequestMapping("/report")
public class ReportController {
    @Autowired
    private ReportService reportService;
    @GetMapping("/empJobData")
    public Result empJobData(){
        log.info("统计员工人数");
        JobOption jobOption= reportService.empJobData();
        return Result.success(jobOption);
    }

    @GetMapping("/empGenderData")
    public Result empGenderData(){
        log.info("统计员工性别信息");
        List<Map> dataList = reportService.empGenderData();
        return Result.success(dataList);
    }

    @GetMapping("/studentDegreeData")
    public Result studentDegreeData(){
        log.info("统计学员的学历信息");
        List<Map> dataList = reportService.studentDegreeData();
        return Result.success(dataList);
    }

    /**
     * 统计每一个班级的人数
     */
    @GetMapping("/studentCountData")
    public Result studentCountData(){
        log.info("统计每一个班级的人数");
        StuNum stuNum= reportService.getCountData();
        return Result.success(stuNum);
    }
}
