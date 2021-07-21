package com.exercise.five;

public class InvalidAccountException extends Exception{
	String msg = "Account not found";
	InvalidAccountException(String str){
		this.msg = str;
	}
	public InvalidAccountException() {}
	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
