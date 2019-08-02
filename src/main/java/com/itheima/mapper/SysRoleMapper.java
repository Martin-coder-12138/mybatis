package com.itheima.mapper;

import com.itheima.pojo.SysRole;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.CacheNamespaceRef;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.cache.decorators.FifoCache;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @version V1.0
 * @author: ZhangZheng
 * @Date: 2019/7/24
 * @Time: 11:01
 * @description
 */
@CacheNamespaceRef(SysRoleMapper.class)
public interface SysRoleMapper {

    @Select({"Select * From sys_role Where id = #{id}"})
    public SysRole selectById(@Param("id") Long id);

}
