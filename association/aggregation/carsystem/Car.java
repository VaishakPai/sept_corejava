package com.vtech.association.aggregation.carsystem;

public class Car {
    String model;
    Engine engine; // Aggregation

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void startCar() {
        System.out.println(model + " car is starting...");
        engine.startEngine();
    }
}