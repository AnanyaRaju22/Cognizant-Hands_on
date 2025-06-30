package com.example.setup_junit_eclipse_02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

 @Test
 public void testAddition() {
     Calculator calc = new Calculator();
     int result = calc.add(3, 7);
     assertEquals(10, result, "3 + 7 should be 10");
 }
}
