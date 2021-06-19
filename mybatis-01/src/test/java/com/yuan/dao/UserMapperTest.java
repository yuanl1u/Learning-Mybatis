package com.yuan.dao;

import com.yuan.pojo.User;
import com.yuan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Yuan Liu
 * @create 2021-06-18 12:11 上午
 */
public class UserMapperTest {

    @Test
    public void testSelectUserList(){
        // 第一步：获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 第二步：执行(方式一getMapper)
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for (User user : userList) {
            System.out.println("user = " + user);
        }

        // 关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testSelectUserListLike(){
        // 第一步：获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 第二步：执行(方式一getMapper)
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        // 实现模糊查询
        List<User> userList = mapper.getUserListLike("yuan");

        for (User user : userList) {
            System.out.println("user = " + user);
        }

        // 关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testGetUserById(){
        // 获取sqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 获取mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 调用接口的方法进行增删改查
        User user = mapper.getUserById(1);

        System.out.println("user = " + user);

        sqlSession.close();
    }

    @Test
    public void testGetUserByIdThroughMap(){
        // 获取sqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 获取mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("HelloId", 2);
        map.put("HelloName", "xiaohan");
        // 使用map当做参数传递
        User user = mapper.getUserByIdThroughMap(map);

        System.out.println("user = " + user);

        sqlSession.close();
    }

    @Test
    public void testAddUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int result = mapper.addUser(new User(4, "new", "123456"));

        // sql增删改查需要提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void testUpdateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int res = mapper.updateUser(new User(4, "haha", "654321"));

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.deleteUser(4);
        sqlSession.commit();
        sqlSession.close();
    }
}
