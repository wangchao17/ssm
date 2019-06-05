package com.guofu.libai.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guofu.libai.dao.UserDao;
import com.guofu.libai.entity.User;
import com.guofu.libai.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	@Override
	public User getUserById(String id){
		return userDao.selectByPrimaryKey(Integer.valueOf(id));
	}
}
