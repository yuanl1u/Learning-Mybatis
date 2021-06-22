package com.yuan.dao;

import com.yuan.pojo.User;

/**
 * @author Yuan Liu
 * @create 2021-06-18 12:01 上午
 */
public interface UserMapper {
    // 根据id查询用户
    User getUserById(int id);
}
