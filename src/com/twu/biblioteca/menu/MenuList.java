package com.twu.biblioteca.menu;
import com.twu.biblioteca.service.BookService;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MenuList {
     private HashMap menu = new HashMap();

     public MenuList() {
        this.menu.put(1, "List Books");
        this.menu.put(2, "quit");
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
                System.out.println(new BookService().getAllBook());
                break;
            default: System.out.println("Select a valid option!");

        }
    }
}
