package com.itheima.mapper;

import com.itheima.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper //声明当前接口时Mybatis的持久层；框架运行时，会自动的为该接口生成一个实现类对象（代理对象），并且将该是实现类对象交给IOC容器管理。
public interface DeptMapper {
//      方法一：手动结果映射
/*
    @Results({
            @Result(column = "create_time", property = "createTime"),
            @Result(column = "update_time", property = "updateTime")
    })
*/
//    方法二：起别名
//    @Select("select id, name, create_time createTime, update_time updateTime from dept")
    @Select("select id, name, create_time, update_time from dept")
    List<Dept> findAll();

    /**
     * 根据id删除部门
     */
    @Delete("delete from tlias.dept where id= #{id}")
    void deleteById(Integer id);


    /**
     * 添加部门
     */

    @Insert("insert into tlias.dept(name, create_time, update_time) VALUES(#{name},#{createTime},#{updateTime})")
    void add(Dept dept);


    /**
     * 根据id查询部门
     */
    @Select("select id, name, create_time, update_time from tlias.dept where id = #{id}")
    Dept getById(Integer id);


    /**
     * 根据ID更新部门时间
     */
    //@Update("update tlias.dept set name = #{name},update_time = #{updateTime} where id = #{id}")
    void update(Dept dept);
}
