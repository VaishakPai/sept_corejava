package com.vtech.associations.aggregation.humanheart;

public class Human {
    private Heart heart;

    public Human() {
        heart = new Heart();
    }

    public void startPump() {
        heart.pump();
    }
}