package com.twu.biblioteca.repository;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MenuRepository {
    private HashMap menus = new HashMap();

    public MenuRepository() {
            this.menus.put(1, Operations.LISTNOOKS);
            this.menus.put(2, Operations.CHECKOUTBOOK);
            this.menus.put(3, Operations.RETURNBOOK);
            this.menus.put(4, Operations.LISTMOVIES);
            this.menus.put(5, Operations.CHECKOUTMOVIE);
            this.menus.put(6, Operations.QUIT);
    }

    public String getAll() {
        Iterator iterator = menus.entrySet().iterator();
        String menusString = "";
        while (iterator.hasNext()) {
            Map.Entry next = (Map.Entry) iterator.next();
            menusString += next.getKey() + ": " + next.getValue() + "\n";
        }
        return menusString;
    }

    public String getOperation(int code) {
        Object operation = menus.get(code);
        if(operation == null){
            return Operations.INVALID;
        }
        return (String) operation;
    }
}
