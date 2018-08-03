package com.example.tmdbapplication.model;

public class Movie {

    private String title;
    private String posterPath;

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }
}
