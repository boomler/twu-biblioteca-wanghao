package com.twu.biblioteca.repository;

import java.util.stream.Stream;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User check(String name, String password) {
        User[] matchedUsers = Stream.of(users).filter(u -> name == u.getName() && password == u.getPassword()).toArray(User[]::new);
        if(matchedUsers.length == 0){
            return null;
        } else {
            return matchedUsers[0];
        }

    }
}
