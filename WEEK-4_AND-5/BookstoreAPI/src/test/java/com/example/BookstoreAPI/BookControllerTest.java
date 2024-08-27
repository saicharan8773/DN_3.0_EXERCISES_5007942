package com.example.BookstoreAPI;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;
    @Test
    public void testGetBookById() throws Exception {
        // Define the behavior of the mock bookService
        Book book = new Book(1L, "Book Title", "Author", 10.99, "9780061120084");
        when(bookService.getBookById(1L)).thenReturn(Optional.of(book));
        // Simulate a GET request to /books/1
        mockMvc.perform(MockMvcRequestBuilders.get("/books/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.title").value("Book Title"))
                .andExpect(jsonPath("$.author").value("Author"))
                .andExpect(jsonPath("$.price").value(10.99))
                .andExpect(jsonPath("$.isbn").value("9780061120084"));
    }

    @Test
    public void testGetAllBooks() throws Exception {
        // Define the behavior of the mock bookService
        List<Book> books = new ArrayList<>();
        books.add(new Book(1L, "Book Title 1", "Author 1", 10.99, "9780061120084"));
        books.add(new Book(2L, "Book Title 2", "Author 2", 9.99, "9780061120085"));
        when(bookService.getAllBooks()).thenReturn(books);

        // Simulate a GET request to /books
        mockMvc.perform(MockMvcRequestBuilders.get("/books"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", org.hamcrest.Matchers.hasSize(2)));
    }

    @Test
    public void testCreateBook() throws Exception {
        // Define the behavior of the mock bookService
        Book book = new Book(1L, "Book Title", "Author", 10.99, "9780061120084");
        when(bookService.createBook(book)).thenReturn(book);

        // Simulate a POST request to /books
        String json = "{\"id\":1,\"title\":\"Book Title\",\"author\":\"Author\",\"price\":10.99,\"isbn\":\"9780061120084\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/books")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.title").value("Book Title"))
                .andExpect(jsonPath("$.author").value("Author"))
                .andExpect(jsonPath("$.price").value(10.99))
                .andExpect(jsonPath("$.isbn").value("9780061120084"));
    }

    @Test
    public void testUpdateBook() throws Exception {
        // Define the behavior of the mock bookService
        Book book = new Book(1L, "Book Title", "Author", 10.99, "9780061120084");
        when(bookService.updateBook(1L, book)).thenReturn(book);

        // Simulate a PUT request to /books/1
        String json = "{\"id\":1,\"title\":\"Book Title\",\"author\":\"Author\",\"price\":10.99,\"isbn\":\"9780061120084\"}";
        mockMvc.perform(MockMvcRequestBuilders.put("/books/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.title").value("Book Title"))
                .andExpect(jsonPath("$.author").value("Author"))
                .andExpect(jsonPath("$.price").value(10.99))
                .andExpect(jsonPath("$.isbn").value("9780061120084"));
  
                }

    @Test
    public void testDeleteBook() throws Exception {
        // Define the behavior of the mock bookService
        doNothing().when(bookService).deleteBook(1L);

        // Simulate a DELETE request to /books/1
        mockMvc.perform(MockMvcRequestBuilders.delete("/books/1"))
                .andExpect(status().isNoContent());
    }
}