package com.example;

import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeaderConfig {

    @Bean
    //@ConditionalOnClass(name = "io.jsonwebtoken.Jwts")
    //@ConditionalOnMissingBean
    @ConditionalOnProperty(name = "abc" ,havingValue = "itheima")
    public HeaderParser headerParser(){
        return new HeaderParser();
    }


    @Bean
    public HeaderGenerator headerGenerator(){
        return new HeaderGenerator();
    }

    @Bean
    public TokenParser tokenGenerator(){
        return new TokenParser();
    }
}
