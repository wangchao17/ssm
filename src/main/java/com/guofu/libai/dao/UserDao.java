package com.guofu.libai.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.guofu.libai.entity.User;

@MapperScan
public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}