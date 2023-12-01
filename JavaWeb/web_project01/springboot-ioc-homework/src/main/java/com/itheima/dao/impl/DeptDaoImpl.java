package com.itheima.dao.impl;

import com.itheima.dao.DeptDao;
import com.itheima.pojo.Result;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
@Repository
public class DeptDaoImpl implements DeptDao {
    @Override
    public List<String> list2() {
        //1. 加载文件 ,  获取原始数据
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("dept.txt");
        List<String> lines = IOUtils.readLines(in, "UTF-8");
        return lines;
    }
}
