package com.twu.biblioteca.service;
import com.twu.biblioteca.repository.Book;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MenuRepository;
import com.twu.biblioteca.repository.Operations;
import com.twu.biblioteca.service.BookService;

import java.time.LocalDate;
import java.util.*;

public class MenuService {
    private BookService bookService;
    private MenuRepository menuRepository;
     public MenuService() {
         Book[] myBooks = new Book[] {
                 new Book(1,"book01", "wang", LocalDate.of(2017, 12, 23)),
                 new Book(2,"book01", "wang", LocalDate.of(12,2,1)),
                 new Book(3,"book01", "wang", LocalDate.of(2016,2,2))
         };
         bookService = new BookService(new BookRepository(myBooks));
         menuRepository = new MenuRepository();
     }

    public void listMenu() {
        System.out.println("\n##################");
        System.out.println("Please choose the following choices:");
        System.out.println(menuRepository.getAll());
    }

    public String choose() {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        String operation = menuRepository.getOperation(s);
        System.out.println("Your choose is : `"+ operation +"`");
        return operation;
    }

    public void excuse(String operation) {
        switch (operation) {
            case Operations.LISTNOOKS:
                System.out.println(bookService.getAllBook());
                break;
            case Operations.RETURNBOOK:
                int returnBookId = new Scanner(System.in).nextInt();
                bookService.returnBook(returnBookId);
                break;
            case Operations.CHECKOUTBOOK:
                int checkoutBookId = new Scanner(System.in).nextInt();
                bookService.checkOutBook(checkoutBookId);
                break;
            default: System.out.println("Select a valid option!");

        }
    }
}
