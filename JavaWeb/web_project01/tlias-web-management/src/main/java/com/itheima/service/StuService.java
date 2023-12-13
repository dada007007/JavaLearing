package com.itheima.service;

import com.itheima.pojo.PageBean;
import com.itheima.pojo.Stu;
import com.itheima.pojo.StuQueryParam;

import java.util.List;

public interface StuService {


    PageBean page(StuQueryParam stuQueryParam);

    void delete(List<Integer> ids);

    void add(Stu stu);

    Stu findById(Integer id);

    void update(Stu stu);

    void updateViolation(Integer id, Integer score);
}
