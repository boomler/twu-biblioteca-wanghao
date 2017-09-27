package com.twu.biblioteca.repository;

import java.util.stream.Stream;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public UserRepository() {
        User[] registedUsers = new User[]{ new User("ww@thoughtworks.com", "Beijing", "wang", "123","123", "user001")};
        this.users = registedUsers;
    }

    public User find(String libraryNumber, String password) {
        for(User user: users){
            if(user.getLibraryNumber().equals(libraryNumber) && user.getPassword().equals(password)) {
                return user;
            }
        }
       return null;
    }
}
