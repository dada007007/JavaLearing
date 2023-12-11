package com.itheima.service;

import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpQueryParam;
import com.itheima.pojo.PageBean;

import java.util.List;

public interface EmpService {
    PageBean page(EmpQueryParam queryParam);

    void add(Emp emp) throws Exception;

    void delete(List<Integer> ids);

    Emp getInfo(Integer id);
}
