package com.tengfeiyang.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.tengfeiyang.model.User;
import com.tengfeiyang.service.UserService;
import com.tengfeiyang.serviceImpl.UserServiceImpl;

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private UserService userService = new UserServiceImpl();
	
	private String userName;
	private String password;
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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
		// 检查用户名是否重复
		User user = userService.getUser(userName);
		if (user == null) {
			User newUser = new User();
			newUser.setUserName(userName);
			newUser.setPassword(password);
			newUser.setEmail(email);
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
