package com.itheima.dao.impl;

import com.itheima.dao.DeptDao;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
@Repository
public class DeptDaoImpl implements DeptDao {
    @Override
    public List<String> list() throws IOException {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("dept.txt");
        List<String> lines = IOUtils.readLines(inputStream, "UTF-8");
        return lines;
    }
}
