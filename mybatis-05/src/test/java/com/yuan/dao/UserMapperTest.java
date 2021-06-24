package com.yuan.dao;

import com.yuan.pojo.User;
import com.yuan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Yuan Liu
 * @create 2021-06-24 17:17
 */
public class UserMapperTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = mapper.getUsers();
//
//        for (User user : users) {
//            System.out.println("user = " + user);
//        }

//        User user = mapper.getUserById(1);
//        System.out.println("user = " + user);

//        mapper.addUser(new User(4, "haha", "123456"));

//        mapper.updateUser(new User(4, "xixi", "123456"));

        mapper.deleteUser(4);


        sqlSession.close();
    }

}
