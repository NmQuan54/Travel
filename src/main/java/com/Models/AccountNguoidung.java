package com.Models;

public class AccountNguoidung {
    private String username;
    private String password;
    private String email;

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public AccountNguoidung(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account [username=" + username + ", password=" + password + ", email=" + email +"]";
    }

}
