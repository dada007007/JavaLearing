package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.ClazzMapper;
import com.itheima.mapper.StuMapper;
import com.itheima.pojo.Clazz;
import com.itheima.pojo.ClazzQueryParam;
import com.itheima.pojo.Emp;
import com.itheima.pojo.PageBean;
import com.itheima.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ClazzServiceImpl implements ClazzService {

    @Autowired
    private ClazzMapper clazzMapper;
    @Autowired
    private StuMapper stuMapper;

    @Override
    public void add(Clazz clazz) {
        // 1、为基础属性赋值
        clazz.setCreateTime(LocalDateTime.now());
        clazz.setUpdateTime(LocalDateTime.now());

        // 2、调用mapper接口
        clazzMapper.add(clazz);
    }

    @Override
    public List<Clazz> list() {
        return clazzMapper.findAll();
    }

    @Override
    public PageBean page(ClazzQueryParam queryParam) {

        PageHelper.startPage(queryParam.getPage(),queryParam.getPageSize());

        List<Clazz> clazzList =  clazzMapper.page(queryParam);
        clazzList.stream().forEach(e->{
            if (e.getBeginDate().isAfter(LocalDate.now())){
                e.setStatus("未开课");
            }else if(e.getEndDate().isBefore(LocalDate.now())){
                e.setStatus("已结课");
            }else {
                e.setStatus("在读");
            }

        });
        Page<Clazz> p =(Page<Clazz>) clazzList;
        return new PageBean(p.getTotal(),p.getResult());

    }

    /**
     * 删除班级,先删下面的学生
     */
    @Override
    public void delete(Integer id) {
        stuMapper.delete(id);
        clazzMapper.delete(id);
    }

    @Override
    public Clazz getById(Integer id) {
        return clazzMapper.getById(id);
    }

    @Override
    public void update(Clazz clazz) {
        clazz.setUpdateTime(LocalDateTime.now());
        clazzMapper.update(clazz);
    }
}
