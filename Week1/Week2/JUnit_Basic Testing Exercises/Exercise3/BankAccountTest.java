package com.example.setup_junit_eclipse_02;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class BankAccountTest {
    BankAccount account;
    @BeforeEach
    public void setUp() {
        // Arrange: Create a new account before each test
        account = new BankAccount("John Doe", 1000.0);
    }
    @AfterEach
    public void tearDown() {
        // Clean-up (optional)
        account = null;
    }
    @Test
    public void testDeposit() {
        // Act
        account.deposit(500.0);
        // Assert
        assertEquals(1500.0, account.getBalance(), "Deposit should increase balance");
    }
    @Test
    public void testWithdraw() {
        // Act
        account.withdraw(300.0);
        // Assert
        assertEquals(700.0, account.getBalance(), "Withdraw should reduce balance");
    }
    @Test
    public void testOverWithdraw() {
        // Act
        account.withdraw(1500.0);
        // Assert
        assertEquals(1000.0, account.getBalance(), "Should not allow over-withdraw");
    }
    @Test
    public void testOwnerName() {
        assertEquals("John Doe", account.getOwner(), "Owner name should match");
    }
}

