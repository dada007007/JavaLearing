package com.itheima.service.impl;

import com.itheima.mapper.EmpMapper;
import com.itheima.mapper.StuMapper;
import com.itheima.pojo.JobOption;
import com.itheima.pojo.Stu;
import com.itheima.pojo.StuNum;
import com.itheima.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private StuMapper stuMapper;

    @Override
    public JobOption empJobData() {
        List<Map> jobData = empMapper.getJobData();
        List<Object> jobList = jobData.stream().map(map -> {
            return map.get("pos");
        }).toList();
        List<Object> dataList = jobData.stream().map(map -> {
            return map.get("posCount");
        }).toList();
        return new JobOption(jobList, dataList);

    }

    @Override
    public List<Map> empGenderData() {
        return empMapper.getGenderData();

    }

    @Override
    public List<Map> studentDegreeData() {
        return stuMapper.getDegreeData();
    }

    @Override
    public StuNum getCountData() {
        List<Map> stuData = stuMapper.getCountData();
        List<Object> clazzList = stuData.stream().map(map -> {
            return map.get("clazzName");
        }).toList();
        List<Object> dataList = stuData.stream().map(map -> {
            return map.get("clazzCount");
        }).toList();
        return new StuNum(clazzList, dataList);
    }


}
