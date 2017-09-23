package com.twu.biblioteca;

import com.twu.biblioteca.service.WelcomeService;
import org.junit.Assert;
import org.junit.Test;

public class WelcomeServiceTests {
    @Test
    public void sayHelloTest() {
        WelcomeService welcomeService = new WelcomeService();
        Assert.assertEquals("Welcome to Biblioteca", WelcomeService.sayWelcome());
    }
}
