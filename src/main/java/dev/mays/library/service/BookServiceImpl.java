package dev.mays.library.service;
import dev.mays.library.entity.Book;
//import dev.mays.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class BookServiceImpl implements BookService {

    @Override
    public List<Book> getAllBooks() {
       
        throw new UnsupportedOperationException("Unimplemented method 'getAllBooks'");
    }

    @Override
    public Book getBookById(Long id) {
       
        throw new UnsupportedOperationException("Unimplemented method 'getBookById'");
    }

    @Override
    public Book addBook(Book book) {
       
        throw new UnsupportedOperationException("Unimplemented method 'addBook'");
    }

    @Override
    public Book updateBook(Long id, Book book) {
      
        throw new UnsupportedOperationException("Unimplemented method 'updateBook'");
    }

    @Override
    public void deleteBook(Long id) {
   
        throw new UnsupportedOperationException("Unimplemented method 'deleteBook'");
    }

}
