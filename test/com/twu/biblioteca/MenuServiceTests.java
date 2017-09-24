package com.twu.biblioteca;

import com.twu.biblioteca.repository.MenuRepository;
import com.twu.biblioteca.repository.Operations;
import com.twu.biblioteca.service.MenuService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MenuServiceTests {
    private MenuService menuService;
    private MenuRepository menuRepository;

    @Before
    public void setup() {
        menuService = new MenuService();
        menuRepository = new MenuRepository();

    }
    @Test
    public void getMenuTest() {
        Assert.assertEquals(Operations.LISTNOOKS, menuRepository.getOperation(1));
        Assert.assertEquals(Operations.CHECKOUTBOOK, menuRepository.getOperation(2));
        Assert.assertEquals(Operations.RETURNBOOK, menuRepository.getOperation(3));
        Assert.assertEquals(Operations.LISTMOVIES, menuRepository.getOperation(4));
        Assert.assertEquals(Operations.CHECKOUTMOVIE, menuRepository.getOperation(5));
        Assert.assertEquals(Operations.QUIT, menuRepository.getOperation(6));
    }
    @Test
    public void getMenusListTest() {
        String expectedMenu = "1: list books\n" +
                "2: checkout book\n" +
                "3: return book\n" +
                "4: list movies\n" +
                "5: checkout movie\n" +
                "6: quit\n";
        Assert.assertEquals(expectedMenu, menuRepository.getAll());
    }
}
