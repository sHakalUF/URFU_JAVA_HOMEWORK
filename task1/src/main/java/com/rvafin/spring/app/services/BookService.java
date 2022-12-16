package com.rvafin.spring.app.services;

import com.rvafin.spring.web.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final ProjectRepository<Book> bookRepo;

    @Autowired
    public BookService(ProjectRepository<Book> bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Book> getAllBooks() {
        return bookRepo.retreiveAll();
    }

    public void saveBook(Book book) {
        if (book.getSize() != null || !book.getAuthor().isEmpty() || !book.getTitle().isEmpty()){
            bookRepo.store(book);
        }
    }

    public boolean removeBookById(Integer bookIdToRemove) {
        return bookRepo.removeItemById(bookIdToRemove);
    }

    public void removeBooksByAuthor(String regex) {
        bookRepo.removeItemsByAuthor(regex);
    }

    public void removeBooksByTitle(String regex) {
        bookRepo.removeItemsByTitle(regex);
    }

    public void removeBooksBySize(String regex) {
        bookRepo.removeItemsBySize(regex);
    }
}
