package com.vtech.associations.aggregation.task25102025;

public class Human {
    Heart heart;  // Composition
    Iphone phone; // Aggregation

    public Human(Iphone phone) {
        this.heart = new Heart();
        this.phone = phone;
    }

    public void live() {
        heart.beat();
        System.out.println("Using phone: " + phone.model);
    }
}
