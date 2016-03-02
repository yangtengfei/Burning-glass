package com.tengfeiyang.serviceImpl;

import org.hibernate.SessionFactory;

import com.tengfeiyang.service.CareerTestService;
import com.tengfeiyang.util.DBUtil;

public class CareerTestServiceImpl implements CareerTestService {

	private SessionFactory sessionFactory = DBUtil.getSessionFactory();


}
