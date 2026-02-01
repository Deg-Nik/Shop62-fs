package model;

import java.time.LocalDateTime;

/**
 * @author : Nikolai Degtiarev
 * created : 01.02.26
 *
 *
 **/
public class User {
    private Long id;
    private String email;
    private String password;
    private String fullName;
    private Role role;
    private LocalDateTime createdAt;


    public User() {

    }

    public User(String email, String password, String fullName, Role role, LocalDateTime createdAt) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.role = role;
        this.createdAt = createdAt;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
