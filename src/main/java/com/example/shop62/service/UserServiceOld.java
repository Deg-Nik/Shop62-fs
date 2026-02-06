package com.example.shop62.service;

import com.example.shop62.model.User;
import com.example.shop62.repository.UserRepository;
import com.example.shop62.repository.UserRepositoryDB;
import com.example.shop62.repository.UserRepositoryMap;

public class UserServiceOld {
    // Жесткая связь с конкретной реализацией
    private UserRepository userRepositoryMemory = new UserRepositoryMap();
    //
    //private UserRepository userRepository2 = new UserRepositoryImpl();
    private UserRepositoryDB userRepositoryDB = new UserRepositoryDB();

    private InputUserService inputUserService = new InputUserService();
    private EmailService emailService = new EmailService();


    User newUser = inputUserService.addNewUser();

    /*
    if (newUser != null) {
        userRepositoryDB.save(newUser);
        emailService.sendEmail(newUser.getEmail(), "Welcome to Shop62", "Thank you for registering!");
    } else {
        System.out.println("User not added.");
    }

     */
}