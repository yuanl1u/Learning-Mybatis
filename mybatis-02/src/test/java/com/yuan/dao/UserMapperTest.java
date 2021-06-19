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
}
