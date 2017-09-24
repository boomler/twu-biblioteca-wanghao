package com.twu.biblioteca.service;

import com.twu.biblioteca.repository.User;
import com.twu.biblioteca.repository.UserRepository;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean login(String libraryNumber, String password) {
        User user = userRepository.find(libraryNumber,password);
        return user != null;
    }

}
