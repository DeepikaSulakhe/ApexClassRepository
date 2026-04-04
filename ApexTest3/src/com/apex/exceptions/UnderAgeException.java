package com.apex.exceptions;

public class UnderAgeException extends Exception{

	private String message;
	
	public UnderAgeException(String message){
		super("UnderAge Exception : "+ message);
		this.message = message;
	}
}
