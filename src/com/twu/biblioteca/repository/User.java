package com.twu.biblioteca.repository;

import org.hamcrest.Matcher;

public class User {
    private String email;
    private String address;
    private String name;
    private String password;
    private String phoneNumber;

    public User(String email, String address, String name, String password, String phoneNumber) {
        this.email = email;
        this.address = address;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
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
}
