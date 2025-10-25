package com.vtech.associations.aggregation.task25102025;

public class Company {
    Address address;   // Aggregation
    Employee employee; // Composition

    public Company(Address address, String empName) {
        this.address = address;
        this.employee = new Employee(empName);
    }

    public void display() {
        System.out.println("Company located in " + address.city + ", " + address.state);
        System.out.println("Employee: " + employee.name);
    }
}
