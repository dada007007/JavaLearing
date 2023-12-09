package com.itheima.service;

import com.itheima.pojo.Customer;
import com.itheima.pojo.CustomerQueryParam;
import com.itheima.pojo.PageBean;

public interface CustomerService {
    void add(Customer customer);

    PageBean page(CustomerQueryParam customerQueryParam);

    Customer findByID(Integer id);

    void update(Customer customer);

    void delete(Integer id);
}
