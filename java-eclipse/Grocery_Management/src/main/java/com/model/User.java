package com.model;

public class User {
	
	private int userId;
	private String userName;
	private String role;
	private String password;
	
	
	public User() {}
	
	public User(int userId, String userName, String role, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.role = role;
		this.password = password;
	}
	
	
	
	public int getId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public String getRole() {
		return role;
	}
	public String getPassword() {
		return password;
	}
	
	
	public void setId(int userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + userId + ", userName=" + userName + ", role=" + role + ", password=" + password + "]";
	}
	
}
