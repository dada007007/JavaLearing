package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.ClazzMapper;
import com.itheima.mapper.StuMapper;
import com.itheima.pojo.Clazz;
import com.itheima.pojo.ClazzQueryParam;
import com.itheima.pojo.Emp;
import com.itheima.pojo.PageBean;
import com.itheima.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ClazzServiceImpl implements ClazzService {

    @Autowired
    private ClazzMapper clazzMapper;
    @Autowired
    private StuMapper stuMapper;

    /**
     * 添加班级
     */
    @Override
    public void add(Clazz clazz) {
        // 1、判断传入的日期是否合法
        if(clazz.getEndDate().isBefore(clazz.getBeginDate())){
            throw new DateTimeException("开课日期在结课日期之后");
        }
        // 2、为基础属性赋值
        clazz.setCreateTime(LocalDateTime.now());
        clazz.setUpdateTime(LocalDateTime.now());

        // 3、调用mapper接口
        clazzMapper.add(clazz);
    }

    /**
     * 查询所有班级信息
     */
    @Override
    public List<Clazz> list() {
        return clazzMapper.findAll();
    }

    /**
     * 班级查询分页操作
     */
    @Override
    public PageBean page(ClazzQueryParam queryParam) {

        PageHelper.startPage(queryParam.getPage(),queryParam.getPageSize());

        List<Clazz> clazzList =  clazzMapper.page(queryParam);
        clazzList.stream().forEach(e->{
            if (e.getBeginDate().isAfter(LocalDate.now())){
                e.setStatus("未开课");
            }else if(e.getEndDate().isBefore(LocalDate.now())){
                e.setStatus("已结课");
            }else {
                e.setStatus("在读");
            }

        });
        Page<Clazz> p =(Page<Clazz>) clazzList;
        return new PageBean(p.getTotal(),p.getResult());

    }

    /**
     * 删除班级,先判断下面是否有学生，没有就删，有就抛异常删不了
     */

    @Override
    public void delete(Integer id) {
        // 统计一下传进来的班级id下学生表中是否有人
        if(stuMapper.count(id)>0){
            throw new UnsupportedOperationException("对不起, 该班级下有学生, 不能直接删除") ;
        };
        //如果上面条件不成立的话，也就不会抛异常了，证明也没有学生，那就执行班级的删除操作
        clazzMapper.delete(id);
    }

    /**
     * 通过id查询班级
     */
    @Override
    public Clazz getById(Integer id) {
        return clazzMapper.getById(id);
    }

    /**
     * 班级信息更新
     */
    @Override
    public void update(Clazz clazz) {
        // 1、判断传入的日期是否合法
        if(clazz.getEndDate().isBefore(clazz.getBeginDate())){
            throw new DateTimeException("开课日期在结课日期之后");
        }
        clazz.setUpdateTime(LocalDateTime.now());// 更新时间重新赋值
        clazzMapper.update(clazz);
    }
}
