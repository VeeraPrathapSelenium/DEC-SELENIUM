package com.exceptions;

public class DataBaseException extends Exception {
	
	String message=null;
	
	DataBaseException(String message){
		super(message);
		this.message=message;
	}
	
	
	public String toString() {
		return message;
	}
	

}
