package com.example.mockito;

public class NotificationService {

    private MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void notifyUser(String userId) {
        sender.sendEmail(userId, "Welcome via Email");
        sender.sendSMS(userId, "Welcome via SMS");
    }
}
