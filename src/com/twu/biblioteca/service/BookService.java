package com.twu.biblioteca.service;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.repository.BookRepository;

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
        boolean updateResult = bookRespository.updateAvaliableStatus(bookId, false);
        if(!updateResult) {
            System.out.println("That book is not avaliable");
            return false;
        } else {
            System.out.println("Thank you! Enjoy the book");
            return true;
        }

    }

    public boolean returnBook(int bookId) {
        boolean updateResult = bookRespository.updateAvaliableStatus(bookId, true);
        if(!updateResult) {
            System.out.println("That is not a valid book to return.");
            return false;
        } else {
            System.out.println("Thank you for returning the book.");
            return true;
        }

    }
}
