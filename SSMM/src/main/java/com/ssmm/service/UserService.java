package com.ssmm.service;

import com.ssmm.model.User;

public interface UserService {
	/**
	 * 根据ID获取
	 * @param id
	 * @return
	 */
	public User getUserById(int id);
	
	
	/**
	 * 保存用户
	 * @param user
	 */
	public void saveUser(User user);
}
