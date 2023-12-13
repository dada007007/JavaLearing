package com.itheima.mapper;

import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpQueryParam;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmpMapper {
    /**
     * 获取总记录数
     */
//    @Select("select count(*) from emp left join dept on emp.dept_id = dept.id")
//    Long count();

    /**
     * 分页查询
     */
//    @Select("select emp.* ,dept.name deptName " +
//            "from emp left join dept on emp.dept_id = dept.id limit #{start},#{pageSize}")
//    List<Emp> list(Integer start, Integer pageSize);

//    @Select("select emp.* ,dept.name deptName from emp left join dept on emp.dept_id = dept.id")
    List<Emp> list(EmpQueryParam queryParam);

    @Options(useGeneratedKeys = true,keyProperty = "id")//需要获取数据库自动增长的主键，并赋值给
    @Insert("insert into emp (username, name, gender, phone, job, salary, image, entry_date, dept_id, create_time, update_time)" +
            " VALUES (#{username},#{name},#{gender},#{phone},#{job},#{salary},#{image},#{entryDate},#{deptId},#{createTime},#{updateTime}) ")
    void add(Emp emp);

    /**
     * 根据ID批量删除员工数据
     */
    void deleteByIds(List<Integer> ids);

    /**
     * 根据ID查询员工信息
     */
    Emp getInfo(Integer id);

    /**
     * 更新员工基本信息
     */
    void update(Emp emp);

    @Select("select * from emp")
    List<Emp> findAll();

    /**
     * 查询每个职位对应的人数
     */
    @MapKey("pos")
    List<Map> getJobData();

    @MapKey("name")
    List<Map> getGenderData();


}
