package com.example.setup_junit_eclipse_02;

public class MathUtils {

    public int multiply(int a, int b) {
        return a * b;
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
