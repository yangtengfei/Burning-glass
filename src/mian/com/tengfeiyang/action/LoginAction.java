package com.tengfeiyang.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tengfeiyang.model.User;
import com.tengfeiyang.service.UserService;
import com.tengfeiyang.serviceImpl.UserServiceImpl;

public class LoginAction extends ActionSupport {

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
		// 检查是否有该用户
		System.out.println(user.getUserName() + " " + user.getPassword());
		User user1 = userService.getUser(user.getUserName(), user.getPassword());
		if (user1 != null) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

}
