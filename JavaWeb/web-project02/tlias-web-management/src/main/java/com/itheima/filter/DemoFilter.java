package com.itheima.filter;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import lombok.extern.slf4j.Slf4j;


import java.io.IOException;
//@Slf4j
//@WebFilter(urlPatterns = "/*")  //拦截所有
//public class DemoFilter implements Filter {
//
////    @Override
////    public void init(FilterConfig filterConfig) throws ServletException {
////        log.info("DemoFilter 初始化 .....");
////
////    }
////
////    @Override
////    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
////        log.info("DemoFilter拦截到请求 ， doFilter ..... 放行前 ");
////
////        // 放行
////        filterChain.doFilter(servletRequest,servletResponse);
////
////        log.info("DemoFilter拦截到请求 ， doFilter ..... 放行后 ");
////    }
////
////    // 每次拦截到请求之后调用，会调用多次
////
////
////    @Override
////    public void destroy() {
////        log.info("DemoFilter 结束 .....");
////    }
//}
