package com.tengfeiyang.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tengfeiyang.model.User;
import com.tengfeiyang.service.UserService;
import com.tengfeiyang.serviceImpl.UserServiceImpl;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private UserService userService = new UserServiceImpl();
	
	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// 重写 ActionSupport的 execute()方法
	@Override
	public String execute() throws Exception {
		User user = userService.getUser(userName, password);
		if (user != null) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

}
