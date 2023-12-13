package com.itheima.mapper;

import com.itheima.pojo.Stu;
import com.itheima.pojo.StuNum;
import com.itheima.pojo.StuQueryParam;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface StuMapper {




    List<Stu> page(StuQueryParam stuQueryParam);

    void deleteByIds(List<Integer> ids);


    @Insert("insert into student(name, no, gender, phone, idCard, isCollege, address, degree, graduate_date, clazzId, violationCount,violationScore,create_time, update_time) " +
            " values (#{name},#{no},#{gender},#{phone},#{idCard},#{isCollege},#{address},#{degree},#{graduateDate},#{clazzId},#{violationCount},#{violationScore},#{createTime},#{updateTime})")
    void add(Stu stu);

    Stu findById(Integer id);

    void update(Stu stu);

    void updateViolation(Integer id, Integer score);

    @MapKey("name")
    List<Map> getDegreeData();

    @MapKey("name")
    List<Map> getCountData();

    @Delete("delete from student where clazzId =#{id}")
    void delete(Integer id);
}
