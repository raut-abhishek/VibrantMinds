package com.demo;

public class StackFullException extends RuntimeException{
	
	String msg = "Stack is full!!!";
	
	StackFullException(){}
	StackFullException(String message){
		this.msg = message;
	}
	
	public String toString() {
		return getClass().getName() + " : " + msg;
	}
}
