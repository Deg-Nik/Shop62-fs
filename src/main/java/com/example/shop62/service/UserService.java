package com.example.shop62.service;

import com.example.shop62.model.User;
import org.springframework.stereotype.Component;
import com.example.shop62.repository.UserRepository;

@Component
public class UserService {
    private UserRepository userRepository;

    public UserService() {
    }

    // Spring внедрит зависимость через конструктор
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUser(Long id) {
        return userRepository.getById(id);
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}