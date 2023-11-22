package com.itheima.demo2;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Order {
    private int id;
    private LocalDate time;
    private int money;
}
