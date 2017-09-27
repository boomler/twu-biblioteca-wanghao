package com.twu.biblioteca;

import com.twu.biblioteca.repository.User;
import com.twu.biblioteca.repository.UserRepository;
import com.twu.biblioteca.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserServiceTests {
    private UserService userService;
    private UserRepository userRepository;

    @Before
    public void setup() {
        User[] users = new User[] {
                new User("222@hotmail.com", "Beijing", "wang", "1234", "18123", "user-001")
        };
        userRepository = new UserRepository(users);

    }

    @Test
    public void testCheckInvalidUser() {
        User checkResult = userRepository.find("XXX", "ss");
        Assert.assertNull(checkResult);
    }

    @Test
    public void testCheckValidUser() {
        User expectedUser = new User("222@hotmail.com", "Beijing", "wang", "1234", "18123", "user-001");
        User checkResult = userRepository.find("user-001", "1234");
        Assert.assertEquals(expectedUser.getLibraryNumber(), checkResult.getLibraryNumber());
        Assert.assertEquals(expectedUser.getPassword(), checkResult.getPassword());
        Assert.assertEquals(expectedUser.getEmail(), checkResult.getEmail());
    }
}
