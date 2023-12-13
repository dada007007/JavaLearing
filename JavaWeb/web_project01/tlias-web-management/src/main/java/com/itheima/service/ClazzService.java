package com.itheima.service;

import com.itheima.pojo.Clazz;
import com.itheima.pojo.ClazzQueryParam;
import com.itheima.pojo.PageBean;

import java.util.List;

public interface ClazzService {
    void add(Clazz clazz);

    List<Clazz> list();

    PageBean page(ClazzQueryParam queryParam);

    void delete(Integer id);

    Clazz getById(Integer id);

    void update(Clazz clazz);
}
