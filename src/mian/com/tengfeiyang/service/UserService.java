package com.tengfeiyang.service;

import com.tengfeiyang.model.User;

public class UserService {
	public boolean login(User user) {
		if ("Yangtengfei".equals(user.getUserName())
				&& "123456".equals(user.getPassword())) {
			return true;
		} else {
			return false;
		}
	}
}
