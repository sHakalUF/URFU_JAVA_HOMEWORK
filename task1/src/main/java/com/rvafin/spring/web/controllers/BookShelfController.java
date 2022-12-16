package com.rvafin.spring.web.controllers;

import com.rvafin.spring.app.services.BookService;
import com.rvafin.spring.web.dto.Book;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/books")
public class BookShelfController {

    private Logger logger = Logger.getLogger(BookShelfController.class);
    private BookService bookService;

    @Autowired
    public BookShelfController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/shelf")
    public String books(Model model) {
        logger.info("got book shelf");
        model.addAttribute("book", new Book());
        model.addAttribute("bookList", bookService.getAllBooks());
        return "book_shelf";
    }

    @PostMapping("/save")
    public String saveBook(Book book) {
        bookService.saveBook(book);
        logger.info("current repository size: " + bookService.getAllBooks().size());
        return "redirect:/books/shelf";
    }

    @PostMapping("/remove")
    public String removeBook(@RequestParam(value = "bookIdToRemove") Integer bookIdToRemove) {
        bookService.removeBookById(bookIdToRemove);
        return "redirect:/books/shelf";
    }

    @PostMapping("/removeByAuthor")
    public String removeBooksByAuthor(@RequestParam(value = "queryRegex") String queryRegex) {
        bookService.removeBooksByAuthor(queryRegex);
        logger.info("current repository size: " + bookService.getAllBooks().size());
        return "redirect:/books/shelf";
    }

    @PostMapping("/removeByTitle")
    public String removeBooksByTitle(@RequestParam(value = "queryRegex") String queryRegex) {
        bookService.removeBooksByTitle(queryRegex);
        logger.info("current repository size: " + bookService.getAllBooks().size());
        return "redirect:/books/shelf";
    }

    @PostMapping("/removeBySize")
    public String removeBooksBySize(@RequestParam(value = "queryRegex") String queryRegex) {
        bookService.removeBooksBySize(queryRegex);
        logger.info("current repository size: " + bookService.getAllBooks().size());
        return "redirect:/books/shelf";
    }

}
