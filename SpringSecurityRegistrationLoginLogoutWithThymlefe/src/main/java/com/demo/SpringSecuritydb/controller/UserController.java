package com.demo.SpringSecuritydb.controller;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.SpringSecuritydb.model.Role;
import com.demo.SpringSecuritydb.model.User;
import com.demo.SpringSecuritydb.service.RoleService;
import com.demo.SpringSecuritydb.service.UserService;



@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("/registration")
    public String userRegistrationView(Model model){
        model.addAttribute("user", new User());
        model.addAttribute("result", "");
        return "adduser";
    }



    @PostMapping("/registration")
    public String userRegistration(@ModelAttribute User user, Model model){
        user.setActive(1);
        Role role = new Role();
        role.setRole("ADMIN");
        role.setActiveStatus(1);
        roleService.addRole(role);
        user.setRoles(new HashSet<>(Arrays.asList(roleService.getRoleByRole("ADMIN"))));
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userService.addUser(user);
        model.addAttribute("result", "Registration successful");
        return "login";
    }
}