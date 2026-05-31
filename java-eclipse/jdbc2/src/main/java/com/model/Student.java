package com.model;

public class Student {
	private int id;
	
	private String name;
	private String city;
	private double percentage;
	
	
	
//	getter methods
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	
	public double getPercentage() {
		return percentage;
	}
	
	
	
//	setter methods
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	
	public Student() {}

	public Student(int id, String name, String city, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", percentage=" + percentage + "]";
	}
	
	
	
}
