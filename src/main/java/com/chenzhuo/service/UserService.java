package com.chenzhuo.service;

import com.chenzhuo.model.User;

/**
 * User: cz
 * Date: 2017/12/13
 * Time: 17:04
 */

public interface UserService {

    User loadUserByUsername(String s);
}
