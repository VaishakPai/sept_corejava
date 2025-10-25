package com.vtech.polymorphism.overriding;

public class VehicleRunner {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start(); // Vehicle starts with a key

        Vehicle electricVehicle = new ElectricVehicle();
        electricVehicle.start(); // Electric Vehicle starts with a button
    }
}
