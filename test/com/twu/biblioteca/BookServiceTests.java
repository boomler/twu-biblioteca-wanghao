package com.twu.biblioteca;

import com.twu.biblioteca.repository.Book;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.service.BookService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class BookServiceTests {
    private Book[] myBooks;

    @Before
    public void setUp() {
        myBooks = new Book[] {
                new Book(1,"book01", "wang",  LocalDate.of(2017, 10, 1)),
                new Book(2,"book01", "wang", LocalDate.of(2015, 12, 11)),
                new Book(3,"book01", "wang", LocalDate.of(2014, 12, 1))
        };
        
    }
    @Test
    public void getAllBookTest() {
        myBooks[0].setAvaliable(false);
        myBooks[1].setAvaliable(false);
        BookRepository bookRespository = new BookRepository(myBooks);
        Book[] allBooks = bookRespository.getAll();
        Assert.assertEquals(1, allBooks.length);
        BookService bookService = new BookService(bookRespository);
        String expectBooksStr = "id: 3, name: book01, author: wang, publishTIme: 2014-12-01\n";
        Assert.assertEquals(expectBooksStr, bookService.getAllBook());
    }

    @Test
    public void checkoutBookFailTest() {
        myBooks[2].setAvaliable(false);
        int checkoutBookId = myBooks[2].getId();
        BookRepository bookRespository = new BookRepository(myBooks);
        boolean checkResult = new BookService(bookRespository).checkOutBook(checkoutBookId);
        Assert.assertFalse(checkResult);
    }

    @Test
    public void checkoutBookSuccessTest() {
        int checkoutBookId = myBooks[2].getId();
        BookRepository bookRespository = new BookRepository(myBooks);
        boolean checkResult = new BookService(bookRespository).checkOutBook(checkoutBookId);
        Assert.assertTrue(checkResult);
        Assert.assertFalse(myBooks[2].getIsAvaliable());
    }

    @Test
    public void returnBookSuccessfullyTest() {
        int returnBookId = myBooks[2].getId();
        myBooks[2].setAvaliable(false);
        BookRepository bookRepository = new BookRepository(myBooks);
        boolean returnResult = new BookService(bookRepository).returnBook(returnBookId);
        Assert.assertTrue(returnResult);
        Assert.assertTrue(myBooks[2].getIsAvaliable());
    }
    @Test
    public void returnBookFailTest() {
        int returnBookId = myBooks[2].getId();
        myBooks[2].setAvaliable(true);
        BookRepository bookRepository = new BookRepository(myBooks);
        boolean returnResult = new BookService(bookRepository).returnBook(returnBookId);
        Assert.assertFalse(returnResult);
        Assert.assertTrue(myBooks[2].getIsAvaliable());

    }

}
