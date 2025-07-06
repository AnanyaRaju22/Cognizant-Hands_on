package com.library;

public class Library {
    private Book book;

    // Setter-based injection
    public void setBook(Book book) {
        this.book = book;
    }

    public void showBook() {
        System.out.println("Library contains:");
        book.display();
    }
}
