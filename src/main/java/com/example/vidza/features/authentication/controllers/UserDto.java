package com.example.vidza.features.authentication.controllers;

public class UserDto {
    private String  username;
    private String password;
    private String active;
    private String roles;

    public UserDto(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public UserDto(String username, String password, String active, String roles) {
        this.username = username;
        this.password = password;
        this.active = active;
        this.roles = roles;
    }
}
