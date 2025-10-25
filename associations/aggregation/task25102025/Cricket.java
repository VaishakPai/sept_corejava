package com.vtech.associations.aggregation.task25102025;

public class Cricket {
    Player player;        // Composition
    CricketGear gear;     // Aggregation

    public Cricket(String playerName, CricketGear gear) {
        this.player = new Player(playerName);
        this.gear = gear;
    }

    public void display() {
        System.out.println("Player: " + player.name);
        System.out.println("Gear: " + gear.type);
    }
}
