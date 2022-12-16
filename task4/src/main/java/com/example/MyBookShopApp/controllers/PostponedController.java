package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.data.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class PostponedController {
    private final BookService bookService;

    public PostponedController(BookService bookService) {
        this.bookService = bookService;
    }

    @ModelAttribute("booksList")
    public List<Book> bookList() {
        return bookService.getBooksData();
    }

    @GetMapping("/postponed")
    public String postponedBookPage() {
        return "postponed";
    }
}
