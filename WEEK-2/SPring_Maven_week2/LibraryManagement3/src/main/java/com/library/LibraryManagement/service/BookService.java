package com.library.LibraryManagement.service;

import com.library.LibraryManagement.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void performService() {
        System.out.println("BookService is now using: " + bookRepository);
    }
}
