package com.itheima.service;

import com.itheima.pojo.EmpLog;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


public interface EmpLogService {
    void insertLog(EmpLog empLog);
}
