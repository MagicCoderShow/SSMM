package com.ssmm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssmm.dao.UserMapper;
import com.ssmm.model.User;
import com.ssmm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	public User getUserById(int id) {
		User user = userMapper.selectByPrimaryKey(id); 
		return user;
	}

	public void saveUser(User user) {
		userMapper.insertSelective(user);
	}
	
	

}
