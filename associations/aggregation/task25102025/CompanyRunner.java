package com.vtech.associations.aggregation.task25102025;

public class CompanyRunner {
    public static void main(String[] args) {
        Address address = new Address("Bangalore", "Karnataka");
        Company company = new Company(address, "Vaishak");
        company.display();
    }
}
