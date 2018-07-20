package com.chenzhuo.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * User: cz
 * Date: 2017/10/18
 * Time: 16:57
 */
/*@SpringBootApplication
@ComponentScan(basePackages = { "com.chenzhuo.web" })
@ServletComponentScan*/
@Configuration
//@EnableAutoConfiguration
//@MapperScan(basePackages = { "com.wstro.**.dao.**", "com.wstro.**.dao" })
//@EnableTransactionManagement
public class WebMVCConfig extends WebMvcConfigurerAdapter {
//    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        System.err.println("这个也要配置吗");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("user/login").setViewName("user/login");
        registry.addViewController("user/welcome").setViewName("user/welcome");
    }

    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }*/
}
