package com.example.BookstoreAPI;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

	Optional<Book> findById(int i);
}
