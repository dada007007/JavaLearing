package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.EmpExprMapper;
import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.*;
import com.itheima.service.EmpLogService;
import com.itheima.service.EmpService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Autowired
    private EmpExprMapper empExprMapper;

    @Autowired
    private EmpLogService empLogService;
/*    @Override
    public PageBean page(Integer page, Integer pageSize) {
        // 1、调用Mapper接口获取总记录数 total
        Long total = empMapper.count();
        // 2、获取结果列表 rows
        Integer start = (page - 1) * pageSize;
        List<Emp> rows = empMapper.list(start, pageSize);
        // 3、封装结果
        return new PageBean(total, rows);
    }*/

    @Override
    public PageBean page(EmpQueryParam QueryParam) {
        // 1、设置分页参数
        PageHelper.startPage(QueryParam.getPage(), QueryParam.getPageSize());
        // 2、执行查询
        List<Emp> empList = empMapper.list(QueryParam);
        // 3、解析结果
        Page<Emp> p = (Page<Emp>) empList;
        return new PageBean(p.getTotal(), p.getResult());
    }

    @Transactional(rollbackFor = {Exception.class}) // 事务管理的注解
    @Override
    public void add(Emp emp) throws Exception {
        try {
            // 1、调用empMapper保存员工的基本信息
            // 先给时间赋值
            emp.setCreateTime(LocalDateTime.now());
            emp.setUpdateTime(LocalDateTime.now());
            empMapper.add(emp);

            //模拟：异常发生
//        if(true){
//            throw new Exception("出现异常了~~~");
//        }

            // 2、调用empExprMapper保存员工的工作经历信息

            List<EmpExpr> exprList = emp.getExprList();
            if (!CollectionUtils.isEmpty(exprList)) {
                exprList.forEach(empExpr -> {
                    empExpr.setEmpId(emp.getId());
                });
                empExprMapper.insertBatch(exprList);
            }


        } finally {
            // 记录新增员工的操作日志
            EmpLog emplog = new EmpLog(null, LocalDateTime.now(), emp.toString());
            empLogService.insertLog(emplog);
        }


    }

    @Transactional
    @Override
    public void delete(List<Integer> ids) {
        // 1、批量删除员工的基本信息
        empMapper.deleteByIds(ids);
        // 2、批量删除员工工作经历信息
        empExprMapper.deleteByEmpIds(ids);
    }

    @Override
    public Emp getInfo(Integer id) {
        return empMapper.getInfo(id);

    }

    @Transactional
    @Override
    public void update(Emp emp) {
        // 1、更新员工基本信息
        // 更新时间
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.update(emp);
        // 2、删除员工原有的工作经历
//        List<Integer> list = new ArrayList<>();
//        list.add(emp.getId());
        empExprMapper.deleteByEmpIds(Arrays.asList(emp.getId()));
        // 3、添加员工现在的工作经历
        List<EmpExpr> exprList = emp.getExprList();
        if (!CollectionUtils.isEmpty(exprList)) {
            exprList.forEach(empExpr -> {
                empExpr.setEmpId(emp.getId());
            });
            empExprMapper.insertBatch(exprList);
        }



    }

    @Override
    public List<Emp> list() {
        return empMapper.findAll();
    }

    @Override
    public Emp login(Emp emp) {
        return empMapper.getByUsernameAndPassword(emp);
    }
}
