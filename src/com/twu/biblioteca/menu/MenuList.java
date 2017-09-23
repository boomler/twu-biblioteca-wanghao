package com.twu.biblioteca.menu;
import com.twu.biblioteca.Book;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.service.BookService;

import java.time.LocalDate;
import java.util.*;

public class MenuList {
    private BookService bookService;
    private HashMap menu = new HashMap();

     public MenuList() {
        this.menu.put(1, "List Books");
        this.menu.put(2, "quit");
         Book[] myBooks = new Book[] {new Book(1,"book01", "wang", LocalDate.of(2017, 12, 23)),
                 new Book(2,"book01", "wang", LocalDate.of(12,2,1)),
                 new Book(3,"book01", "wang", LocalDate.of(2016,2,2))};
         bookService = new BookService(new BookRepository(myBooks));

     }

    public void listMenu() {
        System.out.println("Please choose the following choices:");
        Iterator iterator = menu.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry next = (Map.Entry) iterator.next();
            System.out.println(next.getKey() + ": "  + next.getValue());}
    }

    public String choose() {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        return (String) menu.get(s);
    }

    public void excuse(String operation) {
        switch (operation) {
            case "List Books":
                System.out.println(bookService.getAllBook());
                break;
            default: System.out.println("Select a valid option!");

        }
    }
}
