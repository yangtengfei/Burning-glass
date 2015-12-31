package com.tengfeiyang.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.tengfeiyang.model.User;
import com.tengfeiyang.service.UserService;
import com.tengfeiyang.serviceImpl.UserServiceImpl;

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private UserService userService = new UserServiceImpl();
	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	// 重写 ActionSupport的 execute()方法
	@Override
	public String execute() throws Exception {
		// 检查用户名是否重复
		User user2 = userService.getUser(user.getUserName());
		if (user2 == null) {
			User newUser = new User();
			newUser.setUserName(user.getUserName());
			newUser.setPassword(user.getPassword());
			newUser.setEmail(user.getEmail());
			newUser.setCreateTime(new Date());
			newUser.setModifyTime(new Date());
			userService.saveUser(newUser);
			return SUCCESS;
		} else {
			// 用户名已
			return ERROR;
		}
	}

}
