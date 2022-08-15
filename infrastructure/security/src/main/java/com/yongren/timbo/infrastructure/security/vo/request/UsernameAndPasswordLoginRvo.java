package com.yongren.timbo.infrastructure.security.vo.request;

public class UsernameAndPasswordLoginRvo {

    private String username;
    private String password;

    public UsernameAndPasswordLoginRvo() {

    }

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
}
