package com.tengfeiyang.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("MyInterceptor销毁");
	}

	@Override
	public void init() {
		System.out.println("MyInterceptor初始化");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		String result = invocation.invoke();
		System.out.println("result:" + result);
		
		return result;
	}

}
