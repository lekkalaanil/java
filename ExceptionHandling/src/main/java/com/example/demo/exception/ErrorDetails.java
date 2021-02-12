package com.example.demo.exception;

import lombok.Data;


public class ErrorDetails {
	
	private String messege;
	private String url;
	
	public String getMessege() {
		return messege;
	}
	public void setMessege(String messege) {
		this.messege = messege;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
