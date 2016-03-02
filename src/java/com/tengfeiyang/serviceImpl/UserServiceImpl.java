package com.tengfeiyang.serviceImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tengfeiyang.model.User;
import com.tengfeiyang.service.UserService;
import com.tengfeiyang.util.DBUtil;

public class UserServiceImpl implements UserService {

	private SessionFactory sessionFactory = DBUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	
	@Override
	// 登录：检查是否存在该用户
	public User getUser(String userName, String password) {
		String hql="from User user where user.userName=:username";
		session.beginTransaction();
		User user = (User) session.createQuery(hql).setParameter("username", userName).uniqueResult();
		session.close();
		if (!password.equals(user.getPassword())) {
			user = null;
		}
		return user;
	}

	@Override
	// 注册：检查用户名是否重复
	public User getUser(String userName) {
		String hql="from User user where user.userName=:username";
		session.beginTransaction();
		User user = (User) session.createQuery(hql).setParameter("username", userName).uniqueResult();
		session.close();
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
