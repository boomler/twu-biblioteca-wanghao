package com.twu.biblioteca;

import com.twu.biblioteca.repository.User;
import com.twu.biblioteca.repository.UserRepository;
import com.twu.biblioteca.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserServiceTests {
    private UserService userService;

    @Before
    public void setup() {
        User[] users = new User[] {
                new User("222@hotmail.com", "Beijing", "wang", "1234", "18123", "user-001")
        };
        userService = new UserService(new UserRepository(users));
    }

    @Test
    public void testCheckInvalidUser() {
        boolean checkResult = userService.login("XXX", "ss");
        Assert.assertFalse(checkResult);
    }

    @Test
    public void testCheckValidUser() {
        boolean checkResult = userService.login("user-001", "1234");
        Assert.assertTrue(checkResult);
    }
}
