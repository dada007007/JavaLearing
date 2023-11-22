package com.itheima.demo3;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Student {
    private int id;
    private String name;
    private char sex;
    private LocalDateTime selectTime;
    private String location; // 地址
}
