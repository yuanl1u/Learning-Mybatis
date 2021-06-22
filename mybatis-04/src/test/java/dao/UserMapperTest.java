package dao;

import com.yuan.dao.UserMapper;
import com.yuan.pojo.User;
import com.yuan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @author Yuan Liu
 * @create 2021-06-18 12:11 上午
 */
public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void testSelectUserList(){
        // 输出到日志 一眼就可以看见相对位置
        // 代替sout输出 而且有多个等级 info, debug, error，且可以在日志中永久保存
        logger.info("进入testSelectUserList成功!!");
        // 第一步：获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 第二步：执行(方式一getMapper)
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);

        System.out.println("user = " + user);

        // 关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testLog4j(){
        logger.info("info: 进入了testLog4j");
        logger.debug("debug: 进入了testLog4j");
        logger.error("error: 进入了testLog4j");
    }
}
