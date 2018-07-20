package com.chenzhuo.service.impl;

import com.chenzhuo.dao.UserDao;
import com.chenzhuo.model.User;
import com.chenzhuo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: cz
 * Date: 2017/12/27
 * Time: 10:44
 */
//@Service
public class UserServiceImpl implements UserService {
//    @Autowired
    private UserDao userDao;

    public User findUserName(String name) {
        return userDao.findUserName(name);
    }
}
