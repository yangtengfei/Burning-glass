package com.tengfeiyang.service;

import com.tengfeiyang.model.User;

public interface UserService {
	// 登录：检查是否存在该用户
	public User getUser(String userName, String password);
	
	// 注册：检查用户名是否重复
	public User getUser(String userName);

	// 保存用户信息
	public void saveUser(User user);
}
