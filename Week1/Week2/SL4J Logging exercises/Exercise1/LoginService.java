package com.example.mockito;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginService {

    private static final Logger logger = LoggerFactory.getLogger(LoginService.class);

    public void login(String username, String password) {
        if (username == null || username.isEmpty()) {
            logger.warn("Username is empty or null");
            return;
        }

        if (!"admin".equals(username) || !"1234".equals(password)) {
            logger.error("Login failed for user: {}", username);
        } else {
            logger.info("User '{}' logged in successfully", username);
        }
    }
}

