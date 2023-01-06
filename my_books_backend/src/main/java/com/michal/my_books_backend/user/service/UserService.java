package com.michal.my_books_backend.user.service;

import com.michal.my_books_backend.domain.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    List<User> getAllUsers();
}
