package com.itheima;

import com.example.HeaderParser;
import com.example.TokenParser;
import com.itheima.controller.DeptController;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.sound.midi.Soundbank;

@SpringBootTest
class SpringbootWebConfig2ApplicationTests {
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private SAXReader saxReader;

    //获取bean对象
    @Test
    public void testGetBean() {
        //根据bean的名称获取
        Object obj = applicationContext.getBean("deptController");
        System.out.println(obj);

        //根据bean的类型获取
        DeptController deptController = applicationContext.getBean(DeptController.class);
        System.out.println(deptController);

        //根据bean的名称 及 类型获取
        applicationContext.getBean("deptController", DeptController.class);
        System.out.println(deptController);
    }


    //bean的作用域
    @Test
    public void testScope() {
        for (int i = 0; i < 10; i++) {
            DeptController deptController = applicationContext.getBean("deptController", DeptController.class);
            System.out.println(deptController);
        }

    }


    //第三方bean的管理
    @Test
    public void testThirdBean() throws Exception {
        Document document = saxReader.read(this.getClass().getClassLoader().getResource("1.xml"));
        Element rootElement = document.getRootElement();
        String name = rootElement.element("name").getText();
        String age = rootElement.element("age").getText();

        System.out.println(name + " : " + age);
    }
    @Test
    public void testGetBean2(){
        TokenParser tokenParser = applicationContext.getBean(TokenParser.class);
        System.out.println(tokenParser);
    }

    @Test
    public void testGetBean3(){
        HeaderParser headerParser = applicationContext.getBean(HeaderParser.class);
        System.out.println(headerParser);
    }
}
