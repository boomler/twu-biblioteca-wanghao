package com.twu.biblioteca;

import com.twu.biblioteca.repository.Operations;
import com.twu.biblioteca.service.MenuService;
import com.twu.biblioteca.service.GoodByService;
import com.twu.biblioteca.service.WelcomeService;

public class BibliotecaApp {

    public static void main(String[] args) {
        WelcomeService.sayWelcome();
        MenuService menu = new MenuService();
        menu.excuse("list books");
        while(true) {
            menu.listMenu();
            String operation = menu.choose();
            if(operation == Operations.QUIT) {
                GoodByService.sayGoodBye();
                return;
            }
            else {
                menu.excuse(operation);
            }
        }
    }
}
