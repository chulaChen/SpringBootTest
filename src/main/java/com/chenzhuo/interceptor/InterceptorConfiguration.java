package com.chenzhuo.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * User: cz
 * Date: 2017/12/8
 * Time: 15:09
 */
@Component
public class InterceptorConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册拦截器
        System.out.println("进来了吗");
        InterceptorRegistration ir = registry.addInterceptor(new WInterceptor());
        // 配置拦截的路径
//        ir.addPathPatterns("/**");
        // 配置不拦截的路径
//        ir.excludePathPatterns("/**.html");

        // 还可以在这里注册其它的拦截器
        //registry.addInterceptor(new OtherInterceptor()).addPathPatterns("/**");
    }
}

