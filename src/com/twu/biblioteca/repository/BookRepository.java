package com.twu.biblioteca.repository;

import com.twu.biblioteca.Book;
import java.util.Arrays;
import java.util.stream.Stream;

public class BookRepository {
    private Book[] bookList;

    public BookRepository(Book[] books) {

        this.bookList =books;
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
