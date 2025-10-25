package com.vtech.association.aggregation.carsystem;

public class Runner {
    public static void main(String[] args) {
        Engine e1 = new Engine("V8");
        Car c1 = new Car("Mustang", e1);

        c1.startCar(); // Demonstrate aggregation

        // Even if car is destroyed, engine can still exist independently
        e1.startEngine();
    }
}
