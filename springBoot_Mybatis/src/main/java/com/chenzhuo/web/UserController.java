package com.chenzhuo.web;

import com.chenzhuo.dao.UserDao;
import com.chenzhuo.model.User;
import com.chenzhuo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * User: cz
 * Date: 2017/12/27
 * Time: 10:43
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserDao userService;

    @RequestMapping("/welcome")
    public ModelAndView  hello() {
        System.out.println("hahhahahhah");
        return new ModelAndView("user/welcome");
    }
    @RequestMapping("/login")
    @ResponseBody
    public User login() {
        User user = userService.findUserName("test") ;
        System.out.println("hahhahahhah");
        return user;
    }
}
