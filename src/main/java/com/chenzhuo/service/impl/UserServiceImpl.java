package com.chenzhuo.service.impl;

import com.chenzhuo.Dao.UserDao;
import com.chenzhuo.model.User;
import com.chenzhuo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: cz
 * Date: 2017/12/8
 * Time: 10:43
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User loadUserByUsername(String s) {
        User user = userDao.findByUsername(s);
//          User user = new User();
        if (user == null) {
            System.out.println("是空的哦");
//            throw new Exception("用户名不存在");
        }
        System.out.println("s:"+s);
        System.out.println("username:"+user.getUserName()+";password:"+user.getPassword());
        return user;
    }
}
