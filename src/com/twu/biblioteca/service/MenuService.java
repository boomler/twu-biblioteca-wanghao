package com.twu.biblioteca.service;
import com.twu.biblioteca.repository.*;
import com.twu.biblioteca.service.BookService;

import java.time.LocalDate;
import java.util.*;

public class MenuService {
    private BookService bookService;
    private MenuRepository menuRepository;
    private MovieService movieService;

    public MenuService() {
         Book[] myBooks = new Book[] {
                 new Book(1,"book01", "wang", LocalDate.of(2017, 12, 23)),
                 new Book(2,"book01", "wang", LocalDate.of(12,2,1)),
                 new Book(3,"book01", "wang", LocalDate.of(2016,2,2))
         };
         bookService = new BookService(new BookRepository(myBooks));
         Movie[] movies = new Movie[] {
                new Movie(1, "three idots", "director1", 3,"2017"),
                new Movie(2, "a movie", "director2", 0,"2017")
         };
         movieService = new MovieService(new MovieRepository(movies));
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
                bookService.checkOutBook(getInputId("book"));
                break;
            case Operations.CHECKOUTMOVIE:
                movieService.checkOutMovie(getInputId("movie"));
                break;
            case Operations.LISTMOVIES:
                System.out.println(movieService.getAllMovie());
                break;
            default: System.out.println("Select a valid option!");

        }
    }
    private int getInputId(String type) {
        System.out.print("Please input " + type + " number:");
        int id = new Scanner(System.in).nextInt();
        return id;
    }
}
