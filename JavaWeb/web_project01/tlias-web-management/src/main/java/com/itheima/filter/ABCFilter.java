package com.itheima.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import lombok.extern.slf4j.Slf4j;

import javax.sql.PooledConnectionBuilder;
import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;

//@Slf4j
//@WebFilter(urlPatterns = "/*")  //拦截所有
//public class ABCFilter implements Filter{
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        log.info("ABCFilter 初始化 .....");
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        log.info("ABCFilter拦截到请求 ， doFilter ..... 放行前 ");
//
//        // 放行
//        filterChain.doFilter(servletRequest,servletResponse);
//
//        log.info("ABCFilter拦截到请求 ， doFilter ..... 放行后 ");
//    }
//
//    // 每次拦截到请求之后调用，会调用多次
//
//
//    @Override
//    public void destroy() {
//        log.info("ABCFilter 结束 .....");
//    }
//}
