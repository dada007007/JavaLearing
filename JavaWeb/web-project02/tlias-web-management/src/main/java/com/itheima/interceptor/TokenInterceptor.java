package com.itheima.interceptor;

import com.itheima.util.JwtUtils;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;



@Slf4j
@Component
public class TokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
         // 1、获取请求url地址
        String url = request.getRequestURL().toString();
        // 2、判断请求url中是否包含login，如果包含，说明是登录操作，放行。
        if(url.contains("/login") ){
            log.info("登陆操作，放行");

            return true;
        };
        // 3、获取请求头中的令牌（token）。
        String jwt = request.getHeader("token");
        // 4、判断令牌是否存在，如果不存在，响应401。
        if (!StringUtils.hasLength(jwt)){
            log.error("不存在令牌");
            response.setStatus(401);
            return false;
        }
        // 5、解析token，如果解析失败，响应401 。
        try {
            JwtUtils.parseJWT(jwt);
        } catch (Exception e) {
            log.error("令牌无效");
            response.setStatus(401);
            return false;
        }
        // 6、放行。
        return true;

    }
}
