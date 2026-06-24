package com.demo;

public class StackEmptyException extends RuntimeException{
	
	String msg = "Stack is full!!!";
	
	StackEmptyException(){}
	StackEmptyException(String message){
		this.msg = message;
	}
	
	public String toString() {
		return getClass().getName() + " : " + msg;
	}

}
