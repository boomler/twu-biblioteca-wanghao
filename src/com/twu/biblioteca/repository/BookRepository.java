package com.twu.biblioteca.repository;

import com.twu.biblioteca.Book;

import javax.management.OperationsException;
import java.util.Arrays;

public class BookRepository {
    private Book[] bookList;

    public BookRepository(Book[] books) {

        this.bookList =books;
    }

    public  Book[] getAll() {
         return Arrays.stream(bookList).filter(book -> book.getIsAvaliable()).toArray(Book[]::new);
    }

    public void updateAvaliableStatus(int bookId, boolean IsAvaliable) {
        for(Book book: bookList) {
            if(book.getId() == bookId){
                book.setAvaliable(IsAvaliable);
                return;
            }
        }
    }
}
