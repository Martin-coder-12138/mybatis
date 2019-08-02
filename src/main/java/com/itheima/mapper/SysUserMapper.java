package com.itheima.mapper;

import com.itheima.pojo.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * @version V1.0
 * @author: ZhangZheng
 * @Date: 2019/7/24
 * @Time: 11:01
 * @description
 */
public interface SysUserMapper {
    /**
     * 通过Id查找用户
     *
     * @param id
     * @return
     */
    SysUser selectById(@Param("id") Long id);

    /**
     * 查找全部
     *
     * @return
     */
    List<SysUser> selectAll();

    /**
     * 插入数据
     * @param sysUser
     * @return
     */
    int insert(SysUser sysUser);
    int insert2(SysUser sysUser);

    int delete(SysUser sysUser);

    List<SysUser> selectByUser(SysUser sysUser);

    /**
     * 选择性更新数据
     * @param sysUser
     * @return
     */
    int updateByIdSelective(SysUser sysUser);

    SysUser selectByidOrUserName(SysUser sysUser);

    List<SysUser> selectByidList(Map<String,List<Long>> idList);
    /**
     * 批量添加
     * @param sysUserList
     * @return
     */
    int insertList(List<SysUser> sysUserList);

    /**
     *
     * @return
     */
    List<SysUser> selectAllUserAndRoles();

}
