package com.vtech.association.aggregation.carsystem;

public class Engine {
    String type;

    public Engine(String type) {
        this.type = type;
    }

    public void startEngine() {
        System.out.println(type + " \n engine started...");
    }

	
}