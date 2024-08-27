package com.library.LibraryManagement.repository;

import java.util.ArrayList;
import java.util.List;
import com.library.LibraryManagement.model.Book;

public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public BookRepository() {
        // Add some initial books to the repository
        books.add(new Book(1L, "The Great Gatsby", "F. Scott Fitzgerald", 10.99));
        books.add(new Book(2L, "1984", "George Orwell", 8.99));
        books.add(new Book(3L, "To Kill a Mockingbird", "Harper Lee", 12.99));
    }

    public List<Book> findAllBooks() {
        return books;
    }

    public Book findBookById(Long id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public void saveBook(Book book) {
        books.add(book);
    }

    public void deleteBookById(Long id) {
        books.removeIf(book -> book.getId().equals(id));
    }
}
