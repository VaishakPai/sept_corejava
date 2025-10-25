package com.vtech.associations.aggregation;

public class Department {
    String name;
    Teacher teacher; // Aggregation HAS-A relationship

    public Department(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    void display() {
        System.out.println(name + " Department - " + teacher.name);
    }
}
