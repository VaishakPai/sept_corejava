package com.vtech.inheritance.androidphone;



public class Android extends Mobile {
    // Variable
    private double androidVersion;

    // Constructors
    public Android() {
        System.out.println("Android is created..");
    }

    public Android(String name) {
        super(name);
    }

    public Android(String name, String brand) {
        super(name, brand);
    }

    public Android(String name, String brand, double price, double androidVersion) {
        super(name, brand, price);
        this.androidVersion = androidVersion;
    }

    // Display method
    public void display() {
        super.display();
        System.out.println("Android Version: " + androidVersion);
    }
}

