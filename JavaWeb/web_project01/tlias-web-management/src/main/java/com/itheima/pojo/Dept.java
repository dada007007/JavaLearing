package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept {
    private Integer id;//部门id，主键
    private String name;//部门名称
    private LocalDateTime updateTime;//部门创建时间
    private LocalDateTime createTime;//部门更新时间
}
