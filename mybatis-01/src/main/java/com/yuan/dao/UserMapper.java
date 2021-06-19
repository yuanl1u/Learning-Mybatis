package com.yuan.dao;

import com.yuan.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author Yuan Liu
 * @create 2021-06-18 12:01 上午
 */
public interface UserMapper {
    // 查询全部用户
    List<User> getUserList();

    // 实现模糊查询
    List<User> getUserListLike(String value);

    // 根据id查询用户
    User getUserById(int id);

    User getUserByIdThroughMap(Map<String, Object> map);

    // 插入用户
    int addUser(User user);

    // 修改用户
    int updateUser(User user);

    // 删除用户
    int deleteUser(int id);
}
