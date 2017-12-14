package com.example.test.testapp.objects;

import java.util.List;

/**
 * Created by c-kasgus on 2017-12-14.
 */

public class Actor {
    private String id;
    private String name;
    private String description;
    private List<String> movies;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description + "\n";
    }

    public List<String> getMovies() {
        return movies;
    }

    public Actor(String productId, String name, String description, List<String> movies) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.movies = movies;
    }
}
