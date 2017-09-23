package com.twu.biblioteca;


import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class BooksList {

    @Test
    public void shouldGetAllBooks() {

        Book[] books = {
                new Book("book1", "wang", new Date()),
                new Book("book2","hao", new Date())
        };
        Assert.assertEquals("book1", books[0].name);
    }
}
