package com.itheima.config;

import org.dom4j.io.SAXReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 */
@Configuration
public class CommonConfig {
    // 默认Bean的名字是 方法名
    @Bean //该方法在spring项目启动时自动调用，并将方法的返回值交给IOC容器管理 -- bean对象（不推荐）
    public SAXReader saxReader() {
        return new SAXReader();
    }
}
