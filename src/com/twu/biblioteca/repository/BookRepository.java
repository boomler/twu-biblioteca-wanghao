package com.twu.biblioteca.repository;

import java.time.LocalDate;
import java.util.stream.Stream;

public class BookRepository {
    private Book[] bookList;

    public BookRepository(Book[] books) {

        this.bookList =books;
    }

    public BookRepository() {
        bookList = new Book[] {
                new Book(1,"book01", "wang", LocalDate.of(2017, 12, 23)),
                new Book(2,"book01", "wang", LocalDate.of(12,2,1)),
                new Book(3,"book01", "wang", LocalDate.of(2016,2,2))
        };
    }

    public  Book[] getAll() {
         return Stream.of(bookList).filter(book -> book.getIsAvaliable()).toArray(Book[]::new);
    }

    public boolean updateAvaliableStatus(int bookId, boolean IsAvaliable) {
        for(Book book: bookList){
            if(book.getId() == bookId && book.getIsAvaliable() == !IsAvaliable) {
                book.setAvaliable(IsAvaliable);
                return true;
            }
        }
        return false;
    }
}
