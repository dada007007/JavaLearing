package com.itheima.service;

import com.itheima.pojo.JobOption;
import com.itheima.pojo.StuNum;

import java.util.List;
import java.util.Map;

public interface ReportService {
    JobOption empJobData();

    List<Map> empGenderData();

    List<Map> studentDegreeData();

    StuNum getCountData();
}
