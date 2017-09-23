package com.twu.biblioteca;

import org.hamcrest.core.StringContains;

import java.util.Date;

public class Book {
    protected String name;
    protected String author;
    protected Date publishTIme;

    public Book(String name, String author, Date publishTIme) {
        this.name = name;
        this.author = author;
        this.publishTIme = publishTIme;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Date getPublishTIme() {
        return publishTIme;
    }
}
