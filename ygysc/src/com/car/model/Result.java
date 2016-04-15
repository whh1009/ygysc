package com.car.model;

/**
 * 结果信息实体类
 * @author 王宏慧
 *
 */
public class Result {
	boolean status;
	String message;
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
