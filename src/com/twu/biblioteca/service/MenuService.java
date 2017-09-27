package com.twu.biblioteca.service;
import com.twu.biblioteca.repository.*;

import java.util.*;

public class MenuService {
    private BookService bookService;
    private MenuRepository menuRepository;
    private MovieService movieService;

    public MenuService() {
         bookService = new BookService();
         menuRepository = new MenuRepository();
         movieService = new MovieService();
     }

    public void listMenu() {
        System.out.println("\n##################");
        System.out.println("Please choose the following choices:");
        System.out.println(menuRepository.getAll());
    }

    public String choose() {
        int operationId = getId("operation");
        String operation = menuRepository.getOperation(operationId);
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
                bookService.checkOutBook(getId("book"));
                break;
            case Operations.CHECKOUTMOVIE:
                movieService.checkOutMovie(getId("movie"));
                break;
            case Operations.LISTMOVIES:
                System.out.println(movieService.getAllMovie());
                break;
            default: System.out.println("Select a valid option!");

        }
    }
    private int getId(String type) {
        System.out.print("Please input " + type + " number:");
        int id = new Scanner(System.in).nextInt();
        return id;
    }
}
