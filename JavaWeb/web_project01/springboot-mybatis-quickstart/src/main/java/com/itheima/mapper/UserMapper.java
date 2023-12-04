package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper //声明当前接口时Mybatis的持久层；框架运行时，会自动的为该接口生成一个实现类对象（代理对象），并且将该是实现类对象交给IOC容器管理。
public interface UserMapper {
    /**
     * 查询所有用户信息
     */
//    @Select("select * from user")
    public List<User> findAll();

}
