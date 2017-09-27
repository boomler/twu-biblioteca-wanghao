package com.twu.biblioteca.repository;

public class Movie {
    private String name;
    private String director;
    private int rate;
    private String year;
    public boolean isAvaliable;
    private int id;

    public Movie(int id, String name, String director, int rate, String year) {
        this.name = name;
        this.id = id;
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
        return  "id: " + id +
                "; name: " + name +
                "; director: " + director +
                "; rate: " + (rate > 0 ? rate: "unrated") +
                "; year: " + year +
                "\n";
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean getIsAvaliable() {
        return isAvaliable;
    }
}
