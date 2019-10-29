package com.demo.SpringSecuritydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringSecuritydb.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findRoleByRole(String role);
}
