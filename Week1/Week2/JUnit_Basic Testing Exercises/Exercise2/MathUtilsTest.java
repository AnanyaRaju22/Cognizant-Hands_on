package com.example.setup_junit_eclipse_02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testMultiply() {
        MathUtils math = new MathUtils();
        assertEquals(20, math.multiply(4, 5), "4 * 5 should be 20");
        assertNotEquals(15, math.multiply(3, 6), "3 * 6 should not be 15");
    }

    @Test
    public void testIsEven() {
        MathUtils math = new MathUtils();
        assertTrue(math.isEven(10), "10 is even");
        assertFalse(math.isEven(9), "9 is not even");
    }

    @Test
    public void testReverse() {
        MathUtils math = new MathUtils();
        assertEquals("avaJ", math.reverse("Java"), "Reverse of 'Java' should be 'avaJ'");
        assertNotNull(math.reverse("hello"), "Reverse should not return null");
    }
}
