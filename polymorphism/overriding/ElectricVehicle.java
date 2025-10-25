package com.vtech.polymorphism.overriding;

public class ElectricVehicle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Electric Vehicle starts with a button");
    }
}
