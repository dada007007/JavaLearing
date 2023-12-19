package com.itheima.service;

import com.itheima.pojo.PageBean;


public interface LogService {

    PageBean page(Integer page, Integer pageSize);
}
