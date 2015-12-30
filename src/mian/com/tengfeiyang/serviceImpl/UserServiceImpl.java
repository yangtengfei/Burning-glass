package com.tengfeiyang.serviceImpl;

import com.tengfeiyang.model.User;
import com.tengfeiyang.service.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public User getUser(String userName, String password) {
		User user = new User();
		if ("张三".equals(userName)&&"zhangsan".equals(password)) {
			user.setId(1);
			user.setUserName("张三");
			user.setPassword("zhangsan");
			user.setEmail("zhangsan@163.com");
		}else {
			user = null;
		}
		return user;
	}

}
