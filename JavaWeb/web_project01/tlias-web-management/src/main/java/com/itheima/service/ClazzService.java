package com.itheima.service;

import com.itheima.pojo.Clazz;

import java.util.List;

public interface ClazzService {
    void add(Clazz clazz);

    List<Clazz> list();
}
