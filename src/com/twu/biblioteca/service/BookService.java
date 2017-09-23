package com.twu.biblioteca.service;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.repository.BookRepository;

public class BookService {
    public BookRepository bookRespository;

    public BookService() {
        this.bookRespository = new BookRepository();
    }

    public String getAllBook() {
        String bookListStr = "";
        for(Book book: bookRespository.getAll()) {
            bookListStr += "name：" +  book.getName() + "；Author：" + book.getAuthor() + "; publishYear: " + book.getPublishTIme() + "\n";
        }
        return bookListStr;
    }
}
