package Anu;

import java.util.*;

public class Ecommerce{
    public static void main(String[] args) {
        String[] products = {
            "AnanyaPhone",
            "Headphones",
            "Smartphone",
            "Laptop",
            "AnanyaCase",
            "Charger"
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a keyword:");
        String keyword = sc.nextLine().toLowerCase();
        boolean found = false;
        for (String product : products) {
            if (product.toLowerCase().contains(keyword)) {
                System.out.println(product);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products found for Ananya's search.");
        }
    }
}
