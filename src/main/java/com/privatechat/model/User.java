package com.privatechat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String securityCodeHash; // This should be the hashed password

    // Default constructor
    public User() {
    }

    // Constructor with parameters
    public User(String username, String securityCodeHash) {
        this.username = username;
        this.securityCodeHash = securityCodeHash;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSecurityCodeHash() {
        return securityCodeHash;
    }

    public void setSecurityCodeHash(String securityCodeHash) {
        this.securityCodeHash = securityCodeHash;
    }
}
