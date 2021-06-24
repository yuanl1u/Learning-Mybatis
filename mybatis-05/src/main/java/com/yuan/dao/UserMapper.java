package com.yuan.dao;

import com.yuan.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author Yuan Liu
 * @create 2021-06-18 12:01 上午
 */
public interface UserMapper {

    // 使用注解实现查询
    @Select("select * from user")
    List<User> getUsers();
}
