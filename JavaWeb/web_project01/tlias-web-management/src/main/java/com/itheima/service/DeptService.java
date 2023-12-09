package com.itheima.service;

import com.itheima.pojo.Dept;

import java.io.IOException;
import java.util.List;

public interface DeptService {
    List<Dept> list() throws IOException;

    void delete(Integer id);


    void add(Dept dept);


    Dept getById(Integer id);

    void update(Dept dept);
}
