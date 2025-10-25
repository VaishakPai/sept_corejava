package com.vtech.associations.aggregation.carengin;

public class Runner {

	public static void main(String args[]) {
		Driver d = new Driver("jack");
		
		Car c = new Car("toyota supra", "3.0L", d);
		
		c.showDetails();
	}
	
}
