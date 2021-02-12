package com.example.demo.exception;


public class EmployeeNotfoundException extends Exception {
	private String messege;
	public EmployeeNotfoundException(String messege)
	{
		super();
		this.messege=messege;
	}
	
	public String getMessege() {
		return messege;
	}
	public void setMessege(String messege) {
		this.messege = messege;
	}
}
