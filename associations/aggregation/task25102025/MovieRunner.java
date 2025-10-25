package com.vtech.associations.aggregation.task25102025;

public class MovieRunner {
    public static void main(String[] args) {
        Director director = new Director("Raj");
        Movie movie = new Movie("Climax", director);
        movie.display();
    }
}
