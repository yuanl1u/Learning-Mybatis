package dao;

import com.yuan.pojo.User;
import com.yuan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.yuan.dao.UserMapper;

import java.util.List;

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
        User user = mapper.getUserById(1);

        System.out.println("user = " + user);

        // 关闭SqlSession
        sqlSession.close();
    }
}
