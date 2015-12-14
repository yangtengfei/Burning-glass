package com.tengfeiyang.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tengfeiyang.model.User;
import com.tengfeiyang.service.UserService;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private UserService userService = new UserService();
	
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

	@Override
	public String execute() throws Exception {
		System.out.println("路过。。。。。。");
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		if (userService.login(user)) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

}
