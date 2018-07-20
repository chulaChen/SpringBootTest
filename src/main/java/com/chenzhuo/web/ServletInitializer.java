package com.chenzhuo.web;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * User: cz
 * Date: 2017/10/18
 * Time: 17:01
 */
//@SpringBootApplication
@ComponentScan(basePackages = { "com.chenzhuo" })
@MapperScan("com.chenzhuo.Dao")
@EnableAutoConfiguration
public class ServletInitializer extends SpringBootServletInitializer {



    private static final Logger logger = LoggerFactory.getLogger(ServletInitializer.class);

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(ServletInitializer.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        System.err.println("是不是要先启动这个才算");
        return builder.sources(this.getClass());
    }


}
