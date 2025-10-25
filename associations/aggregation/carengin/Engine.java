package com.vtech.associations.aggregation.carengin;

public class Engine {

	private String model;
	
	public Engine(String model) {
		this.model = model;
	}
	
	public void start() {
		System.out.println("Engin model" + model);
	}
	
}
