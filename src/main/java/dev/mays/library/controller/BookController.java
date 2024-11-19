package dev.mays.library.controller;
import dev.mays.library.entity.Book;
import dev.mays.library.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class BookController {

    private final BookService bookService;

 
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // GET /api/books - Retrieve all books
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // GET /api/books/{id} - Retrieve a specific book by ID
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    // POST /api/books - Add a new book
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    // PUT /api/books/{id} - Update an existing book
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }

    // DELETE /api/books/{id} - Remove a book
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}