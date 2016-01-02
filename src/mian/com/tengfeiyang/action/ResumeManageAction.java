package com.tengfeiyang.action;

import com.opensymphony.xwork2.ActionSupport;

public class ResumeManageAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private String result;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public String add() throws Exception{
		System.out.println("增加简历");
		result = "增加简历";
		return SUCCESS;
	}
	
	public String list() throws Exception{
		System.out.println("查询简历");
		result = "查询简历";
		return SUCCESS;
	}
	
	public String update() throws Exception{
		System.out.println("修改简历");
		result = "修改简历";
		return SUCCESS;
	}
	
	public String delete() throws Exception{
		System.out.println("删除简历");
		result = "删除简历";
		return SUCCESS;
	}
	
}
