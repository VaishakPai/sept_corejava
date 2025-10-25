package com.vtech.associations.aggregation.task25102025;

public class CricketRunner {
    public static void main(String[] args) {
        CricketGear gear = new CricketGear("Bat");
        Cricket cricket = new Cricket("Virat", gear);
        cricket.display();
    }
}
