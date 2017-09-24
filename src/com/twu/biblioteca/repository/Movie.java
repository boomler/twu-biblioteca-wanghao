package com.twu.biblioteca.repository;

public class Movie {
    private String name;
    private String director;
    private int rate;
    private String year;
    public boolean isAvaliable;

    public Movie(String name, String director, int rate, String year) {
        this.name = name;
        this.director = director;
        this.rate = rate;
        this.year = year;
        this.isAvaliable = true;
    }

    public void setAvaliable(boolean isAvaliable) {
        this.isAvaliable = isAvaliable;
    }

    @Override
    public String toString() {
        return "name: " + name +
                "; director: " + director +
                "; rate: " + (rate > 0 ? rate: "unrated") +
                "; year: " + year +
                "\n";
    }

    public String getName() {
        return name;
    }
}
