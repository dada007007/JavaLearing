package com.itheima;

import com.example.EnableHeaderConfig;
import com.example.HeaderParser;
import com.example.TokenParser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


//@ComponentScan(basePackages= {"com.example","com.itheima"})
//
//@Import(TokenParser.class)
//@Import(HeaderConfig.class)
//@Import(MyImportSelector.class)

@EnableHeaderConfig
@SpringBootApplication
public class SpringbootWebConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebConfigApplication.class, args);
    }




}
