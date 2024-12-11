package com.lacnaru.GesTa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lacnaru.GesTa.model.User;
import com.lacnaru.GesTa.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> obtenerUsuarios() {
        List<User> users = userRepository.findAll();
        return users;
    } 
    
}
