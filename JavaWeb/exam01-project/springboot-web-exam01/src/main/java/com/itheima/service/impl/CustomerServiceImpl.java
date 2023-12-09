package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.CustomerMapper;
import com.itheima.pojo.Customer;
import com.itheima.pojo.CustomerQueryParam;
import com.itheima.pojo.PageBean;
import com.itheima.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public PageBean page(CustomerQueryParam customerQueryParam) {
        PageHelper.startPage(customerQueryParam.getPage(),customerQueryParam.getPageSize());
        List<Customer> list= customerMapper.page(customerQueryParam);
        Page<Customer> p = (Page<Customer>) list;
        return new PageBean(p.getTotal(),p.getResult());
    }

    @Override
    public Customer findByID(Integer id) {
        Customer customer= customerMapper.findByID(id);
        return customer;
    }

    @Override
    public void update(Customer customer) {
        customer.setUpdateTime(LocalDateTime.now());
        customerMapper.update(customer);
    }

    @Override
    public void delete(Integer id) {
        customerMapper.delete(id);
    }

    @Override
    public void add(Customer customer) {
        customer.setCreateTime(LocalDateTime.now());
        customer.setUpdateTime(LocalDateTime.now());
        customerMapper.add(customer);
    }


}
