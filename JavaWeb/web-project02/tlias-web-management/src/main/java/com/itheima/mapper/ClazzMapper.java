package com.itheima.mapper;

import com.itheima.pojo.Clazz;
import com.itheima.pojo.ClazzQueryParam;
import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClazzMapper {
    /**
     * 添加班级
     */

    @Insert("insert into tlias.clazz(name, room, begin_date, end_date, master_id, subject, create_time, update_time) " +
            "VALUES(#{name},#{room},#{beginDate},#{endDate},#{masterId},#{subject},#{createTime},#{updateTime})")
    void add(Clazz clazz);

    /**
     * 查询所有班级
     */
    @Select("select id, name, room, begin_date beginDate, end_date endDate, master_id masterId, subject, create_time createTime, update_time updateTime from tlias.clazz")
    List<Clazz> findAll();


    List<Clazz> page(ClazzQueryParam queryParam);

    @Delete("delete from clazz where id=#{id}")
    void delete(Integer id);

    @Select("select c.id,c.name,room,begin_date beginDate," +
            "end_date endDate,c.master_id masterId," +
            " e.name masterName,subject," +
            "c.create_time createTime, c.update_time updateTime" +
            " from clazz c left join emp e on c.master_id=e.id " +
            "where c.id = #{id}")
    Clazz getById(Integer id);


    void update(Clazz clazz);
}
