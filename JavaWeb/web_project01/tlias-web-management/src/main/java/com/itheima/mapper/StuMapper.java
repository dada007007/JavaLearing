package com.itheima.mapper;

import com.itheima.pojo.Stu;
import com.itheima.pojo.StuNum;
import com.itheima.pojo.StuQueryParam;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface StuMapper {




    List<Stu> page(StuQueryParam stuQueryParam);

    void deleteByIds(List<Integer> ids);


    @Insert("insert into student(name, no, gender, phone, id_card, is_college, address, degree, graduation_date, clazz_id, violation_count,violation_score,create_time, update_time) " +
            " values (#{name},#{no},#{gender},#{phone},#{idCard},#{isCollege},#{address},#{degree},#{graduationDate},#{clazzId},#{violationCount},#{violationScore},#{createTime},#{updateTime})")
    void add(Stu stu);

    Stu findById(Integer id);

    void update(Stu stu);

    void updateViolation(Integer id, Integer score);

    @MapKey("name")
    List<Map> getDegreeData();

    @MapKey("clazzName")
    List<Map> getCountData();

    @Delete("delete from student where clazz_id =#{id}")
    void delete(Integer id);

    @Select("select count(*) from student where clazz_id=#{id}")
    Integer count(Integer id);
}
