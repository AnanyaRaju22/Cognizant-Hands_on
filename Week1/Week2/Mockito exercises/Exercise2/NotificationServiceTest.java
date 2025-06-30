package com.example.mockito;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class NotificationServiceTest {

    @Test
    public void testNotifyUser_VerifyInteractions() {
        // Arrange
        MessageSender mockSender = mock(MessageSender.class);
        NotificationService notificationService = new NotificationService(mockSender);

        // Act
        notificationService.notifyUser("user123");

        // Assert (verify interactions)
        verify(mockSender).sendEmail("user123", "Welcome via Email");
        verify(mockSender).sendSMS("user123", "Welcome via SMS");

        // Optionally, check how many times
        verify(mockSender, times(1)).sendEmail(anyString(), anyString());
        verify(mockSender, never()).sendEmail("wrongUser", "Some message");
    }
}
