package com.vtech.inheritance.vehiclesystem;

public class VehicleRunner {

	public static void main(String[] args) {
	  Car car = new Car();
	  car.start();
	  car.drive();
	  
 
	  System.out.println("-----------for bike--------");
	  Bike bike = new Bike();
	  bike.start();
	  bike.ride();
	  
	  
	  Vehicle v1 = new Car();
	  v1.start();
	 // v1.drive();
	  
	  Vehicle v2 = new Bike();
	  v2.start();
	 // v2.ride();
	}

}
