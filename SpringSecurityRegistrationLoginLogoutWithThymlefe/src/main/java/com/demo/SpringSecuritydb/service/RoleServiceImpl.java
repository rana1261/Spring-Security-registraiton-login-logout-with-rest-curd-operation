package com.demo.SpringSecuritydb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringSecuritydb.model.Role;
import com.demo.SpringSecuritydb.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;
    @Override
    public void addRole(Role role) {
        roleRepository.save(role);
    }

    @Override
    public Role getRoleByRole(String role) {
        return roleRepository.findRoleByRole(role);
    }

}