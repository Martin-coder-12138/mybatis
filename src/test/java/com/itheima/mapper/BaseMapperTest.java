package com.itheima.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @version V1.0
 * @author: ZhangZheng
 * @Date: 2019/7/24
 * @Time: 11:53
 * @description
 */
public class BaseMapperTest {
    public SqlSessionFactory sqlSessionFactory;
    @Before
    public void setSqlSession() {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis_config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            resourceAsStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
