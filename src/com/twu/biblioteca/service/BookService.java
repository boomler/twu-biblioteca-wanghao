package com.twu.biblioteca.service;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.repository.BookRepository;

import java.util.stream.Stream;

public class BookService {
    public BookRepository bookRespository;
    public BookService(BookRepository bookRepository) {
       this.bookRespository = bookRepository;
    }

    public String getAllBook() {
        String bookListStr = "";
        Book[] all = bookRespository.getAll();

        for(Book book: all){
            bookListStr += book.toString();
        }
        return bookListStr;
    }
    public boolean checkOutBook(int bookId) {
        boolean hasMatched = Stream.of(this.bookRespository.getAll())
                .anyMatch(book -> book.getId() == bookId && book.getIsAvaliable() == true);
        if(!hasMatched){
            System.out.println("That book is not available.");
            return false;
        }
        this.bookRespository.updateAvaliableStatus(bookId, false);
        return true;
    }
}
