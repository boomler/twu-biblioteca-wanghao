package com.twu.biblioteca;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;

public class BooksList {

    @Test
    public void shouldGetAllBooks() {

        Book[] books = {
                new Book(1,"book1", "wang", LocalDate.of(2015,12,12)),
                new Book(2,"book2","hao",LocalDate.of(2000,12,11))
        };
        Assert.assertEquals("book1", books[0].getName());
    }
}
