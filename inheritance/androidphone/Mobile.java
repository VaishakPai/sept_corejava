package com.vtech.inheritance.androidphone;

public class Mobile {
	
	private String name;
	private String brand;
	private double price;
	
	public Mobile() {
		System.out.println("mobile object created");
	}
	
	
	public Mobile(String name) {
		this();
		this.name = name;
	}
	
	public Mobile(String name, String brand) {
		this.name = name;
		this.brand = brand;
	}
	
	public Mobile(String name, String brand, double price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		
	}
	
	public void display() {
		System.out.println("Name: "+ name);
		System.out.println("Brand: " + brand);
	    System.out.println("Price: " + price);
		
	}

}


