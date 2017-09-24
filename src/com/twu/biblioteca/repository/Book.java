package com.twu.biblioteca.repository;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Book {
    private int id;
    private String name;
    private String author;
    private LocalDate publishTIme;
    private boolean isAvaliable;


    public Book(int id, String name, String author, LocalDate publishTIme) {
        this.name = name;
        this.id = id;
        this.author = author;
        this.publishTIme = publishTIme;
        this.isAvaliable = true;

    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublishTIme() {
        return publishTIme;
    }
    public boolean getIsAvaliable() {
        return this.isAvaliable;
    }
    public void setAvaliable(boolean status) {
        isAvaliable = status;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", name: " + name +
                ", author: " + author +
                ", publishTIme: " + publishTIme
                + "\n";
    }

    public int getId() {
        return id;
    }
}
