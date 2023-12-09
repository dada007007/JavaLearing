package com.itheima.mapper;

import com.itheima.pojo.Customer;
import com.itheima.pojo.CustomerQueryParam;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface CustomerMapper {

    @Insert("insert into customer (name, phone, gender, age, qq, description, create_time, update_time) " +
            "VALUES (#{name},#{phone},#{gender},#{age},#{qq},#{description},#{createTime},#{updateTime})")
    void add(Customer customer);


    List<Customer> page(CustomerQueryParam customerQueryParam);

    @Select("select id, name, phone, gender, age, qq, description, create_time createTime, update_time updateTime from customer where id=#{id}")
    Customer findByID(Integer id);

    void update(Customer customer);

    @Delete("delete from customer where id=#{id}")
    void delete(Integer id);
}
