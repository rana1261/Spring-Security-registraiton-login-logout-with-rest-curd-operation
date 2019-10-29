package com.demo.SpringSecuritydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringSecuritydb.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByEmail(String email);
}