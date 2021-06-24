package com.yuan.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Yuan Liu
 * @create 2021-06-17 11:45 下午
 */

// 用于获取sqlSessionFactory对象
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    static{
        // 固定的内容 使用Mybatis第一步：用于获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // build()方法解析xml文件获取配置信息configuration
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }


}
