package com.exception;

public class UserNotFoundException extends Exception {
	String msg = "User not found!!!";
	
	public UserNotFoundException() {}
	public UserNotFoundException(String message) {
        this.msg = message;
    }
	public String toString() {
		return getClass().getName() + " : " + msg;
	}
}
