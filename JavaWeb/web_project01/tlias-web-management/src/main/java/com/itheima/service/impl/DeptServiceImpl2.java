package com.itheima.service.impl;

import com.itheima.dao.DeptDao;
import com.itheima.pojo.Dept;
import com.itheima.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class DeptServiceImpl2 implements DeptService{
    @Autowired

    private DeptDao deptDao; //= new DeptDaoImpl();

    public List<Dept> list() throws IOException {
        System.out.println("2222222222222222");
        List<String> lines = deptDao.list();

        List<Dept> deptList = lines.stream().map(line -> {
            String[] parts = line.split(",");
            Integer id = Integer.parseInt(parts[0]);
            String name = parts[1];
            LocalDateTime updateTime = LocalDateTime.parse(parts[2],
                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new Dept(id, name, updateTime);
        }).toList();
        return deptList;
    }
}
