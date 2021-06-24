package com.yuan.dao;

import com.yuan.pojo.User;
import org.apache.ibatis.annotations.*;

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

    // #{id}中的id对应着@Param注解中的”id“
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id, name, pwd) values (#{id}, #{name}, #{password})")
    int addUser(User user);

    @Update("update user set name = #{name}, pwd = #{password} where id = #{id}")
    int updateUser(User user);

    // 此处故意将id注解改为uid 同时delete的注解也要对应修改成uid
    // 基本类型 + String类型 最好可以使用Param注解，引用类型不加
    // #{} 可以防止sql注入 而 ${} 有可能发生sql注入
    @Delete("delete from user where id = #{uid}")
    int deleteUser(@Param("uid") int id);


}
