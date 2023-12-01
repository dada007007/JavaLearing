package com.itheima.dao.impl;

import com.itheima.dao.LogDao;
import com.itheima.pojo.Result;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Repository;

import java.io.InputStream;
import java.util.List;
@Repository
public class LogDaoImpl implements LogDao {
    @Override
    public List<String> list() {
        //1. 加载log.txt文件数据
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("log.txt");
        List<String> lines = IOUtils.readLines(inputStream, "UTF-8");
        return lines;
    }
}
