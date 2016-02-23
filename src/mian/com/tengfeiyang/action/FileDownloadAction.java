package com.tengfeiyang.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

public class FileDownloadAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String fileName;
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public InputStream getDownloadFile()throws Exception{
		String path;
		if ("Java".equals(fileName)) {
			path = "C:\\Users\\yangtf\\Desktop\\Java.pdf"; // 绝对路径
			File file = new File(path);
			this.fileName = "JavaAnalysisReport.pdf";
			return new FileInputStream(file);
		}
		if ("PHP".equals(fileName)) {
			path = "C:\\Users\\yangtf\\Desktop\\PHP.pdf";
			File file = new File(path);
			this.fileName = "PHPAnalysisReport.pdf";
			return new FileInputStream(file);
		}
		return null;
	}
	
	@Override
	public String execute() throws Exception {
	   return SUCCESS;
	}
}
