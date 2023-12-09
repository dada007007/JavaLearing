package com.itheima.mapper;

import com.itheima.pojo.Clazz;
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
    @Select("select id, name, room, begin_date, end_date, master_id, subject, create_time, update_time from tlias.clazz")
    List<Clazz> findAll();


}
