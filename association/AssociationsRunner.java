package com.vtech.association;

public class AssociationsRunner {
    public static void main(String[] args) {
        Student s = new Student("Guru");
        Teacher t = new Teacher("Shivya");
        Department d = new Department("CSE");

        System.out.println(s.name + " belongs to " + d.name);
        System.out.println(t.name + " teaches " + s.name);
    }
}
