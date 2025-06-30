package com.example.mockito;


public class ShoppingCart {

    private ProductService productService;

    public ShoppingCart(ProductService productService) {
        this.productService = productService;
    }

    public double calculateTotal(String productId, int quantity) {
        double price = productService.getPrice(productId); // this is stubbed
        return price * quantity;
    }
}