package com.model;

public class Product {


	private int productId;
	private String productName;
	private double productPrice;
	private int productQuantity;
	private int productMinThreshold;
	

	
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public int getproductMinThreshold() {
		return productMinThreshold;
	}




	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public void setproductMinThreshold(int productMinThreshold) {
		this.productMinThreshold = productMinThreshold;
	}



	public Product() {}

	public Product(int productId, String productName, double productPrice, int productQuantity,
			int productMinThreshold) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.productMinThreshold = productMinThreshold;
	}




	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productQuantity=" + productQuantity + ", productMinThreshold=" + productMinThreshold + "]";
	}
	
	
	
}
