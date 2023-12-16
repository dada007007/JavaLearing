package com.itheima;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtTest {

    /**
     * 生成Jwt令牌
     */
    @Test
    public void testGenJwt(){
        Map<String,Object> claims = new HashMap<>();
        claims.put("id",1);
        claims.put("username","shinaian");

        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256,"JXU2NTg3JXU5Rjk5JXVGRjBDJXU3Qzk3JXU2NzY1JXU1NUU2JXU0RTAwJXU0RTBC")
                .setExpiration(new Date(System.currentTimeMillis()+7200000))//设置2小时令牌有效时长
                .addClaims(claims)//指定往令牌中存放的数据
                .compact();//生成Jwt令牌
        System.out.println(jwt);

    }
    /**
     * 解析令牌
     * 令牌解析报错，就说明令牌非法的 或 令牌过期了
     */
    @Test
    public void testParseJwt(){
        Claims claims =Jwts.parser()
                .setSigningKey("JXU2NTg3JXU5Rjk5JXVGRjBDJXU3Qzk3JXU2NzY1JXU1NUU2JXU0RTAwJXU0RTBC")
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJleHAiOjE3MDI3MDgwMDQsImlkIjoxMDAsInVzZXJuYW1lIjoi5paH6b6Z5Zem5ZemIn0.seNXGnEJy534o62N_NtvjLWRjWqpGERP0r9tMfkx1Bg")
                .getBody();
        System.out.println(claims);
    }
}
