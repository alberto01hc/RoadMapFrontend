package com.lacnaru.GesTa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lacnaru.GesTa.model.User;
import com.lacnaru.GesTa.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String getAllUsers() {
        List<User> users = userService.obtenerUsuarios();
        List<String> usuarios = new ArrayList<>();
        users.forEach(user -> usuarios.add(user.getName() + " " +  user.getEmail())); 
        return usuarios.toString();
    }
}
