package com.vtech.associations.aggregation.librarysystem;

public class Library {
    private Book book;

    public Library(String name) {
        book = new Book(name);
    }

    public void showBook() {
        System.out.println("Book: " + book.name);
    }
}
