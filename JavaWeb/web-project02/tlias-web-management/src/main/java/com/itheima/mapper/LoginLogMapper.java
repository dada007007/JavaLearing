package com.itheima.mapper;

import com.itheima.pojo.EmpLoginLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginLogMapper {
    //插入日志数据
    @Insert("insert into emp_login_log (username, password, login_time, is_success, jwt, cost_time) " +
            "values (#{username}, #{password}, #{loginTime}, #{isSuccess}, #{jwt},  #{costTime});")
    public void insert(EmpLoginLog log);
}
