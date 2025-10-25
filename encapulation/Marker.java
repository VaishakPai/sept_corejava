package com.vtech.encapulation;

import java.util.Date;

public class Marker {
	
	private String brand;
	private String color;
	private double price;
	private String type;
	private Date  expiryDate;
	

	public Marker() {
		System.out.println("Marker object instantiated/ created");
		
	}
	
	public Marker(String brand, String color, double price, String type, Date expiryDate) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.type = type;
		this.expiryDate = expiryDate;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
	
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getType() {
		return this.type;
	}
	
	public Date getExpiryDate() {
		return this.expiryDate;
	}
	
	
}
