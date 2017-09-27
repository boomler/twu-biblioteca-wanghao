package com.twu.biblioteca.service;

import com.twu.biblioteca.repository.User;
import com.twu.biblioteca.repository.UserRepository;

import java.util.Scanner;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public UserService() {
        this.userRepository = new UserRepository();
    }

    public boolean login() {
        System.out.println("**Please login**");
        System.out.println("Please input library number: ");
        String libraryNumber = new Scanner(System.in).next();
        System.out.println("please input password: ");
        String password = new Scanner(System.in).next();
        User user = userRepository.find(libraryNumber, password);
        if(user != null) {
            System.out.println("Welcome! " + user);
            return true;
        } else {
            return false;
        }
    }

}
