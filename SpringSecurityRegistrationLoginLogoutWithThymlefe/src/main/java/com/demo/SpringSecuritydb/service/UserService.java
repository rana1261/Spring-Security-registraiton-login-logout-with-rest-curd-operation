package com.demo.SpringSecuritydb.service;

import com.demo.SpringSecuritydb.model.User;

public interface UserService {
    void addUser(User user);
    User getUserByEmail(String email);
}