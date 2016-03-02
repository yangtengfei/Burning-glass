package com.tengfeiyang.action;

import com.opensymphony.xwork2.ActionSupport;

public class CareerTestAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	// 保存用户信息时用
//	private CareerTestService careerTestService = new CareerTestServiceImpl();
	private String[] options;
	
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	// 重写 ActionSupport的 execute()方法
	@Override
	public String execute() throws Exception {
		// 获取该用户的职业分析结果
		String result;
		if (options != null) {
			switch (options[0]) {
			case "A":result = SUCCESS; 	// 代表某种结果页面
				
				break;

			default:result = ERROR;		// 代表某种结果页面
				break;
			}
		} else {
			result = LOGIN;				// 没有输入任何信息
		}
		
		
		// 保存该用户的信息
		
		// 反馈职业分析结果页面
		return result;
	}

}
