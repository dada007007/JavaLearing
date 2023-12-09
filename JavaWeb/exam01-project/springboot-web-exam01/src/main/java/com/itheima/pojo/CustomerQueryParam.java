package com.itheima.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Data
public class CustomerQueryParam {
        private Integer gender;
        private String phone;

        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private LocalDate begin;
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private LocalDate end;

        private Integer page = 1;
        private Integer pageSize = 10;
}
