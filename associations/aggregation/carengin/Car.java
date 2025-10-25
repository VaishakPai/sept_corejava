package com.vtech.associations.aggregation.carengin;



public class Car {
    private String carName;
    private Engine engine;  // Composition: Car owns Engine
    private Driver driver;  // Aggregation: Driver exists independently

    public Car(String carName, String model, Driver driver) {
        this.carName = carName;
        this.engine = new Engine(model);
        this.driver = driver;
    }

    public void showDetails() {
        System.out.println("\n Car: " + carName);
        System.out.println("Driver: " + driver.getName());
        engine.start();
    }
}
