package com.itheima.mapper;

import com.itheima.pojo.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @version V1.0
 * @author: ZhangZheng
 * @Date: 2019/7/24
 * @Time: 11:37
 * @description
 */
public class SysUserMapperTest extends BaseMapperTest {

    private SqlSession sqlSession;
    private SysUserMapper sysUserMapper;

    @Before
    public void setuserMapper() {
        sqlSession = super.sqlSessionFactory.openSession();
        sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
    }

    @Test
    public void selectById() {
        try {
            System.out.println("sysUserMapper.selectById(1L) = " + sysUserMapper.selectById(1L));
            System.out.println("sysUserMapper.selectById(1001L) = " + sysUserMapper.selectById(1001L));
        } catch (Exception e) {

            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void selectAll() {

        try {
            List<SysUser> sysUserList = sysUserMapper.selectAll();
            Assert.assertNotNull(sysUserList);
            Assert.assertTrue(sysUserList.size() >0 );


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();

        }
    }

    @Test
    public void insert() {
        try {
            SysUser sysUser = new SysUser();
            sysUser.setUserName("test1");
            sysUser.setHeadImg(new byte[]{1,2,3});
            sysUser.setCreateTime(new Date());
            int insert = sysUserMapper.insert(sysUser);
            sqlSession.commit();
            System.out.println("insert = " + insert);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void insert2() {
        try {
            SysUser sysUser = new SysUser();
            sysUser.setUserName("test2");
            sysUser.setHeadImg(new byte[]{1,2,3});
            sysUser.setCreateTime(new Date());
            int insert = sysUserMapper.insert2(sysUser);
            sqlSession.commit();
            System.out.println("insert = " + insert);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void delete() {
        try {
            SysUser sysUser = new SysUser();
            sysUser.setId(1039L);
            int delete = sysUserMapper.delete(sysUser);
            Assert.assertEquals(delete, 1);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

    }

    @Test
    public void selectByUser() {
        SysUser sysUser = new SysUser();
        sysUser.setUserName("ad");
        List<SysUser> sysUsers = sysUserMapper.selectByUser(sysUser);
        System.out.println("sysUsers = " + sysUsers);
    }

    @Test
    public void updateByIdSelective() {
        try {
            SysUser sysUser = new SysUser();
            sysUser.setId(1L);
            sysUser.setUserEmail("test@itheima.com");
            int update = sysUserMapper.updateByIdSelective(sysUser);
            System.out.println("update = " + update);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void selectByidOrUserName() {
        try {
            SysUser sysUser = new SysUser();
            sysUser.setId(5L);
            SysUser user = sysUserMapper.selectByidOrUserName(sysUser);
            System.out.println("user = " + user);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void selectByidList() {
        try {


            Map<String, List<Long>> idList = new HashMap<String, List<Long>>();
            List<Long> ids = new ArrayList<Long>();
            ids.add(1L);
            ids.add(2L);
            idList.put("id", ids);
            List<SysUser> sysUsers = sysUserMapper.selectByidList(idList);
            System.out.println("sysUsers = " + sysUsers);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void insertList() {
        try {

            List<SysUser> userList = new ArrayList<SysUser>();
            SysUser sysUser = new SysUser();
            sysUser.setUserEmail("tesst@123");
            sysUser.setCreateTime(new Date());
            userList.add(sysUser);
            sysUser = new SysUser();
            sysUser.setUserName("tom");
            sysUser.setHeadImg(new byte[]{1,2,3,4});
            userList.add(sysUser);
            int i = sysUserMapper.insertList(userList);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }



    @Test
    public void selectAllUserAndRoles() {
        try {
            List<SysUser> sysUsers = sysUserMapper.selectAllUserAndRoles();
            Assert.assertNotNull(sysUsers);
            System.out.println("sysUsers = " + sysUsers);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}
