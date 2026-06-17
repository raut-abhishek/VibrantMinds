package com.model;

import java.sql.Date;

public class Orders {
	

	private int id;
	private int userId;
	private double totalAmount;
	private Date orderDate;
	
	
	
	
	
	public int getId() {
		return id;
	}
	public int getUserId() {
		return userId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public Date getOrderDate() {
		return orderDate;
	}


	public void setId(int id) {
		this.id = id;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}



	public Orders() {}
	
	public Orders(int userId, double totalAmount) {
	    this.userId = userId;
	    this.totalAmount = totalAmount;
	}

	public Orders(int id, int userId, double totalAmount, Date orderDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.totalAmount = totalAmount;
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", userId=" + userId + ", totalAmount=" + totalAmount + ", orderDate=" + orderDate
				+ "]";
	}
	
	
}
