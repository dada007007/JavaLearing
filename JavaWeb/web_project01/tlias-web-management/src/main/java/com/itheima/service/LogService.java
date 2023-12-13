package com.itheima.service;

import com.itheima.pojo.PageBean;
import org.springframework.stereotype.Service;


public interface LogService {

    PageBean page(Integer page, Integer pageSize);
}
