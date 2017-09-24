package com.twu.biblioteca.repository;

import java.util.stream.Stream;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User find(String libraryNumber, String password) {
        User[] matchedUsers = Stream.of(users).filter(u -> libraryNumber == u.getLibraryNumber() && password == u.getPassword()).toArray(User[]::new);
        if(matchedUsers.length == 0){
            return null;
        } else {
            return matchedUsers[0];
        }

    }
}
