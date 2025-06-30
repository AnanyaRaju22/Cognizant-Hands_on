package com.example.mockito;

public interface MessageSender {
    void sendEmail(String to, String message);
    void sendSMS(String to, String message);
}
