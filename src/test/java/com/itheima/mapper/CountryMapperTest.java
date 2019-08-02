package com.itheima.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 *
 * @version V1.0
 * @author: ZhangZheng
 * @Date: 2019/7/24
 * @Time: 9:48
 * @description
 */
public class CountryMapperTest {
    private SqlSessionFactory sqlSessionFactory;

    CountryMapper countryMapper;

    SqlSession sqlSession;
    @Before
    public void setSqlSessionFactory() {

        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis_config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

            resourceAsStream.close();

            sqlSession = sqlSessionFactory.openSession();

            countryMapper = sqlSession.getMapper(CountryMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void selectAllCountry() {
        try {
            System.out.println("sqlSession.selectList(\"selectAllCountry\") = " + sqlSession.selectList("selectAllCountry"));
            System.out.println("countryMapper.selectAllCountry() = " + countryMapper.selectAllCountry());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {

            sqlSession.close();
        }
    }


}
