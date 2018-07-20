package com.chenzhuo.Dao;

import com.chenzhuo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by sang on 2017/1/10.
 */

@Repository
@Mapper
public interface UserDao {
    User findByUsername(@Param("userName")String username);
}
