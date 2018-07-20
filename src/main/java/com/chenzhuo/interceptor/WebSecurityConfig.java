package com.chenzhuo.interceptor;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

/**
 * User: cz
 * Date: 2017/12/8
 * Time: 11:25
 */
/*@Configuration
@EnableWebSecurity*/
public class WebSecurityConfig {
//    @Bean
//    UserService customUserService() {
//        return new UserService();
//    }

//    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(new UserService());
    }

//    @Override
    protected void configure(HttpSecurity http) throws Exception {
        System.out.println("looking for it come true");
  /*      http.authorizeRequests()
                .anyRequest().authenticated()
                .and().formLogin().loginPage("user/login").failureUrl("user/welcome").permitAll().and()
                .logout().logoutUrl("user/welcome").permitAll().and();
*/
        http
                .authorizeRequests()
                .antMatchers("/home").permitAll()//访问：/home 无需登录认证权限
                .anyRequest().authenticated() //其他所有资源都需要认证，登陆后访问
                .antMatchers("/hello").hasAuthority("ADMIN") //登陆后之后拥有“ADMIN”权限才可以访问/hello方法，否则系统会出现“403”权限不足的提示
                .and()
                .formLogin()
                .loginPage("/login")//指定登录页是”/login”
                .permitAll()
                .successHandler(new LoginSuccessHandler()) //登录成功后可使用loginSuccessHandler()存储用户信息，可选。
                .and()
                .logout()
                .logoutSuccessUrl("/home") //退出登录后的默认网址是”/home”
                .permitAll()
                .invalidateHttpSession(true)
                .and()
                .rememberMe()//登录后记住用户，下次自动登录,数据库中必须存在名为persistent_logins的表
                .tokenValiditySeconds(1209600);
    }
}
