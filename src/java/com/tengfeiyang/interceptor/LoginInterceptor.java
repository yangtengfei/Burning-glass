package com.tengfeiyang.interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 登录拦截验证
 * @author yangtf
 */
public class LoginInterceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 若已登录，则继续调用
	 * 若未登录，则返回错误页面，并提示登录
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext actionContext = invocation.getInvocationContext();
		Map<String, Object> session = actionContext.getSession();
		Object currentUser = session.get("currentUser");
		String result = null;
		if (currentUser != null) {
			System.out.println(currentUser);
			result = invocation.invoke();
		} else {
			HttpServletRequest request = (HttpServletRequest)invocation.getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
			request.setAttribute("error", "请先登录");
			result = "error";
		}
		return result;
	}

}
