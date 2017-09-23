package com.twu.biblioteca.repository;

import com.twu.biblioteca.Book;

import java.util.Date;

public class BookRepository {
    private Book[] bookList;

    public BookRepository() {

        this.bookList = new Book[] {
                new Book("book01", "wang", new Date()),
                new Book("book02", "hao", new Date())
        };
    }

    public  Book[] getAll() {
        return this.bookList;
    }
}
