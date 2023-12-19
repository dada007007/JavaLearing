package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.StuMapper;
import com.itheima.pojo.PageBean;
import com.itheima.pojo.Stu;
import com.itheima.pojo.StuQueryParam;
import com.itheima.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private StuMapper stuMapper;

    /**
     * 分页查询
     */
    @Override
    public PageBean page(StuQueryParam stuQueryParam) {
        PageHelper.startPage(stuQueryParam.getPage(), stuQueryParam.getPageSize());
        List<Stu> stuList = stuMapper.page(stuQueryParam);
        Page<Stu> p = (Page<Stu>) stuList;
        return new PageBean(p.getTotal(), p.getResult());

    }

    @Override
    public void delete(List<Integer> ids) {
        stuMapper.deleteByIds(ids);
    }

    @Override
    public void add(Stu stu) {
        // 1、调用stuMapper保存学生的信息
        // 先给时间赋值
        stu.setCreateTime(LocalDateTime.now());
        stu.setUpdateTime(LocalDateTime.now());
        stu.setViolationCount(0);
        stu.setViolationScore(0);
        stuMapper.add(stu);
    }

    @Override
    public Stu findById(Integer id) {
        return stuMapper.findById(id);
    }

    @Override
    public void update(Stu stu) {
        stu.setUpdateTime(LocalDateTime.now());
        stuMapper.update(stu);
    }

    /**
     * 扣分如果超过了数据库violation_score的数值限制，
     * 再抛个异常
     */
    @Override
    public void updateViolation(Integer id, Integer score) {
        Integer violationScore = stuMapper.findById(id).getViolationScore();
        if (score + violationScore > 255) {
            throw new NumberFormatException("扣分超过数据限制");
        }
        stuMapper.updateViolation(id, score);
    }
}
