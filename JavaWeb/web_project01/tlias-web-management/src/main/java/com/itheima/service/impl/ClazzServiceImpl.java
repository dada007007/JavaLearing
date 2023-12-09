package com.itheima.service.impl;

import com.itheima.mapper.ClazzMapper;
import com.itheima.pojo.Clazz;
import com.itheima.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ClazzServiceImpl implements ClazzService {

    @Autowired
    private ClazzMapper clazzMapper;

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
}
