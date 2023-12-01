package com.itheima.service;

import com.itheima.pojo.Dept;

import java.io.IOException;
import java.util.List;

public interface DeptService {
    public List<Dept> list() throws IOException;
}
