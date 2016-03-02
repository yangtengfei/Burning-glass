package com.tengfeiyang.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
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

	/**
	 * 登录验证
	 * 验证成功后，将结果存在session里
	 * 以备后续调用
	 */
	@Override
	public String execute() throws Exception {
		System.out.println(user.getUserName() + " " + user.getPassword());
		User user1 = userService.getUser(user.getUserName(), user.getPassword());
		if (user1 != null) {
			ActionContext actionContext = ActionContext.getContext();
			Map<String, Object> session = actionContext.getSession();
			session.put("currentUser", user1);
			System.out.println(session.get("currentUser"));
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

}
