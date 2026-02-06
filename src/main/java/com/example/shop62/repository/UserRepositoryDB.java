package com.example.shop62.repository;

import com.example.shop62.model.User;

import java.util.List;

public class UserRepositoryDB implements UserRepository{
    @Override
    public List<User> getAll() {
        return List.of();
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User getById(long id) {
        return null;
    }

    @Override
    public User getByEmail(String email) {
        return null;
    }

    @Override
    public User delete(long id) {
        return null;
    }
}
