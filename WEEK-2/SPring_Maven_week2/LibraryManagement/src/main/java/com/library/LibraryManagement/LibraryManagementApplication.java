package com.library.LibraryManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.LibraryManagement.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load the Spring context from the XML configuration file
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");

        // Retrieve the BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Call the service method to test the configuration
        bookService.performService();
    }
}
