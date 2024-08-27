package com.example.LibraryManagement;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private double price;
    private String isbn;
	public Object getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setTitle(Object title2) {
		// TODO Auto-generated method stub
		
	}
	public Object getIsbn() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getAuthor() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setIsbn(Object isbn2) {
		// TODO Auto-generated method stub
		
	}
	public void setAuthor(Object author2) {
		// TODO Auto-generated method stub
		
	}

    // Getters and Setters
}
