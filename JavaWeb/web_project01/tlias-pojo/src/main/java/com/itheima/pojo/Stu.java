package com.itheima.pojo;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Stu {
    private Integer id; //ID,主键
    private String name;    //姓名
    private String no;      //学号
    private Integer gender; //性别
    private String phone;   //手机号
    private Integer degree; //学历
    private String idCard;  //身份证号
    private Integer isCollege;//是否是院校学生
    private String address; //联系地址
    private LocalDate graduationDate;//毕业时间
    private Integer violationCount;//违纪次数
    private Integer violationScore;//违纪扣分
    private Integer clazzId;//班级ID
    private String clazzName;//班级名称
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//更新时间

}
