package com.itheima.service;

import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpQueryParam;
import com.itheima.pojo.PageBean;

public interface EmpService {
    PageBean page(EmpQueryParam queryParam);

    void add(Emp emp) throws Exception;
}
