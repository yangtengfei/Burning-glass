package com.tengfeiyang.action;

import com.opensymphony.xwork2.ActionSupport;

public class ApplicationLetterAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private String result;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public String add() throws Exception{
		System.out.println("新增求职信");
		result = "新增求职信";
		return SUCCESS;
	}
	
	public String list() throws Exception{
		System.out.println("查询求职信");
		result = "查询求职信";
		return SUCCESS;
	}
	
	public String update() throws Exception{
		System.out.println("修改求职信");
		result = "修改求职信";
		return SUCCESS;
	}
	
	public String delete() throws Exception{
		System.out.println("删除求职信");
		result = "删除求职信";
		return SUCCESS;
	}
	
}
