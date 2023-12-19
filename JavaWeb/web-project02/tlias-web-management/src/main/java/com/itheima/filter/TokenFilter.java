package com.itheima.filter;

import com.itheima.util.JwtUtils;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.io.IOException;

@Slf4j
//@WebFilter("/*")
public class TokenFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        // 1、获取请求url地址
        String url = request.getRequestURL().toString();
        // 2、判断请求url中是否包含login，如果包含，说明是登录操作，放行。
        if(url.contains("/login") ){
            log.info("登陆操作，放行");
            chain.doFilter(request,response);
            return;
        };
        // 3、获取请求头中的令牌（token）。
        String jwt = request.getHeader("token");
        // 4、判断令牌是否存在，如果不存在，响应401。
        if (!StringUtils.hasLength(jwt)){
            log.error("不存在令牌");
            response.setStatus(401);
            return;
        }
        // 5、解析token，如果解析失败，响应401 。
        try {
            JwtUtils.parseJWT(jwt);
        } catch (Exception e) {
            log.error("令牌无效");
            response.setStatus(401);
            return;
        }
        // 6、放行。
        chain.doFilter(request,response);








    }
}
