package com.guofu.libai.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guofu.libai.dao.UserMapper;
import com.guofu.libai.entity.User;
import com.guofu.libai.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public User getUserById(String id){
		return userMapper.selectByPrimaryKey(Integer.valueOf(id));
	}
}
