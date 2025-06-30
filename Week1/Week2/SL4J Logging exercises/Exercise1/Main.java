package com.example.mockito;

public class Main {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        loginService.login("admin", "wrongpass");  // triggers error
        loginService.login("", "1234");            // triggers warning
        loginService.login("admin", "1234");       // info message
    }
}

