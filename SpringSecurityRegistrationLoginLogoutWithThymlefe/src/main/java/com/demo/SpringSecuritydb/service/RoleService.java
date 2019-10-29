package com.demo.SpringSecuritydb.service;

import com.demo.SpringSecuritydb.model.Role;

public interface RoleService {
    void addRole(Role role);
    Role getRoleByRole(String role);
}
