package com.vtech.associations.aggregation;

public class Runner {
    public static void main(String[] args) {
        Teacher t = new Teacher("Guru");
        Department d = new Department("CSE", t);
        d.display();
    }
}
