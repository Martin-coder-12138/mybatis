package com.itheima.mapper;

import com.itheima.pojo.SysRole;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @version V1.0
 * @author: ZhangZheng
 * @Date: 2019/7/25
 * @Time: 1:31
 * @description
 */
public class SysRoleMapperTest extends BaseMapperTest {

    private SqlSession sqlSession;
    private SysRoleMapper sysRoleMapper;

    @Before
    public void setRoleMapper() {
        sqlSession = super.sqlSessionFactory.openSession();
        sysRoleMapper = sqlSession.getMapper(SysRoleMapper.class);
    }

    @Test
    public void selectById() {
        try {
            SysRole sysRole = sysRoleMapper.selectById(1L);
            System.out.println("sysRole = " + sysRole);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testL2Cache() {
        SysRole role1 = null;
        try {
            role1 = sysRoleMapper.selectById(1L);
            role1.setRoleName("newName");
            SysRole role2 = sysRoleMapper.selectById(1L);
            /*判断对象是否相同*/
            Assert.assertEquals("newName", role2.getRoleName());
            Assert.assertEquals(role1, role2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }

        try {
            //开启一个新的session
           SqlSession sqlSession = super.sqlSessionFactory.openSession();
            SysRoleMapper sysRoleMapper = sqlSession.getMapper(SysRoleMapper.class);
            SysRole role2 = sysRoleMapper.selectById(1L);
            role2.setRoleName("newName");
            /*判断对象是否相同*/
            Assert.assertEquals("newName", role2.getRoleName());
            Assert.assertNotEquals(role1, role2);

            SysRole role3 = sysRoleMapper.selectById(1L);
            Assert.assertNotEquals(role2,role3);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
