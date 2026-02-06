package com.example.shop62.model;

import java.time.LocalDateTime;

/**
 * Класс, представляющий пользователя.
 */
public class User {
    /**
     * Уникальный идентификатор пользователя.
     */
    private Long id;
    /**
     * Электронная почта пользователя.
     */
    private String email;
    /**
     * Пароль пользователя.
     */
    private String password;
    /**
     * Полное имя пользователя.
     */
    private String fullName;
    /**
     * Роль пользователя.
     */
    private Role role;
    /**
     * Дата и время создания пользователя.
     */
    private LocalDateTime createdAt;

    /**
     * Конструктор по умолчанию.
     */
    public User() {
    }

    /**
     * Конструктор с параметрами.
     *
     * @param email     электронная почта пользователя.
     * @param password  пароль пользователя.
     * @param fullName  полное имя пользователя.
     * @param role      роль пользователя.
     * @param createdAt дата и время создания пользователя.
     */
    public User(String email, String password, String fullName, Role role, LocalDateTime createdAt) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.role = role;
        this.createdAt = createdAt;
    }

    /**
     * Возвращает уникальный идентификатор пользователя.
     *
     * @return уникальный идентификатор пользователя.
     */
    public Long getId() {
        return id;
    }

    /**
     * Устанавливает уникальный идентификатор пользователя.
     *
     * @param id уникальный идентификатор пользователя.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Возвращает электронную почту пользователя.
     *
     * @return электронная почта пользователя.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Устанавливает электронную почту пользователя.
     *
     * @param email электронная почта пользователя.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Возвращает пароль пользователя.
     *
     * @return пароль пользователя.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Устанавливает пароль пользователя.
     *
     * @param password пароль пользователя.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Возвращает полное имя пользователя.
     *
     * @return полное имя пользователя.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Устанавливает полное имя пользователя.
     *
     * @param fullName полное имя пользователя.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Возвращает роль пользователя.
     *
     * @return роль пользователя.
     */
    public Role getRole() {
        return role;
    }

    /**
     * Устанавливает роль пользователя.
     *
     * @param role роль пользователя.
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * Возвращает дату и время создания пользователя.
     *
     * @return дата и время создания пользователя.
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Устанавливает дату и время создания пользователя.
     *
     * @param createdAt дата и время создания пользователя.
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

