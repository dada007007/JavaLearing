package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.LogMapper;
import com.itheima.pojo.OperateLog;
import com.itheima.pojo.PageBean;
import com.itheima.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogSeriveImpl implements LogService {
    @Autowired
    private LogMapper logMapper;

    @Override
    public PageBean page(Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        List<OperateLog> logList = logMapper.page();
        Page<OperateLog> p = (Page<OperateLog>) logList;
        return new PageBean(p.getTotal(),p.getResult());
    }
}
