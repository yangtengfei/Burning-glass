package com.tengfeiyang.serviceImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tengfeiyang.model.User;
import com.tengfeiyang.service.UserService;
import com.tengfeiyang.util.DBUtil;

public class UserServiceImpl implements UserService {

	private SessionFactory sessionFactory = DBUtil.getSessionFactory();

	@Override
	// 登录：检查是否存在该用户
	public User getUser(String userName, String password) {
		User user = new User();
		if ("张三".equals(userName) && "zhangsan".equals(password)) {
			user.setId(1);
			user.setUserName("张三");
			user.setPassword("zhangsan");
			user.setEmail("zhangsan@163.com");
		} else {
			user = null;
		}
		return user;
	}

	@Override
	// 注册：检查用户名是否重复
	public User getUser(String userName) {
		User user = new User();
		user = null;
		return user;
	}

	@Override
	// 保存用户信息
	public void saveUser(User user) {
		Session session = sessionFactory.openSession(); 
		session.beginTransaction();

		session.save(user);

		session.getTransaction().commit(); 
		session.close();
		sessionFactory.close();

	}

}
