package com.vtech.associations.aggregation.task25102025;

public class Movie {
    Scene scene;       // Composition
    Director director; // Aggregation

    public Movie(String sceneName, Director director) {
        this.scene = new Scene(sceneName);
        this.director = director;
    }

    public void display() {
        System.out.println("Scene: " + scene.name);
        System.out.println("Director: " + director.name);
    }
}
