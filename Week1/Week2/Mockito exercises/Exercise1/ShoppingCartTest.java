package com.example.mockito;

import org.junit.jupiter.api.Test;

import com.example.setup_junit_eclipse_02.ProductService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ShoppingCartTest {

    @Test
    public void testCalculateTotal() {
        // Arrange
        ProductService mockService = mock(ProductService.class);
        when(mockService.getPrice("P123")).thenReturn(100.0); // Stubbing

        ShoppingCart cart = new ShoppingCart(mockService);

        // Act
        double total = cart.calculateTotal("P123", 3);

        // Assert
        assertEquals(300.0, total, 0.001);
    }
}
