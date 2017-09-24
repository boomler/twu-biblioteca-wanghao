package com.twu.biblioteca.repository;

import org.hamcrest.Matcher;

public class User {
    private String email;
    private String address;
    private String name;
    private String password;
    private String phoneNumber;
    private String libraryNumber;

    public User(String email, String address, String name, String password, String phoneNumber, String libraryNumber) {
        this.email = email;
        this.address = address;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.libraryNumber = libraryNumber;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }
}
