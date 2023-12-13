package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//班级人数
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StuNum {
    private List clazzList; //班级列表
    private List dataList;//数据列表
}
