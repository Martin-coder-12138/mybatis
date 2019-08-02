package com.itheima.mapper;

import com.itheima.pojo.Country;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @version V1.0
 * @author: ZhangZheng
 * @Date: 2019/7/24
 * @Time: 9:30
 * @description
 */
public interface CountryMapper {

    public List<Country> selectAllCountry();
}
