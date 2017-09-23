package com.twu.biblioteca;

import com.twu.biblioteca.menu.MenuList;
import com.twu.biblioteca.service.BookService;
import com.twu.biblioteca.service.GoodByService;
import com.twu.biblioteca.service.WelcomeService;

public class BibliotecaApp {

    public static void main(String[] args) {
        WelcomeService.sayWelcome();
        MenuList menu = new MenuList();
        menu.excuse("list books");
        menu.listMenu();
        while(true) {
            String operation = menu.choose();
            if(operation == "quit") {
                GoodByService.sayGoodBye();
                return;
            }
            else {
                menu.excuse(operation);
            }
        }
    }
}
