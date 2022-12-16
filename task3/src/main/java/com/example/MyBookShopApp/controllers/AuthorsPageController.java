package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookshop")
public class AuthorsPageController {
    private final AuthorService authorService;

    @Autowired
    public AuthorsPageController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public String genresPage(Model model) {
        model.addAttribute("authorsA", authorService.getAuthorsDataByLetter("A"));
        model.addAttribute("authorsB", authorService.getAuthorsDataByLetter("B"));
        model.addAttribute("authorsC", authorService.getAuthorsDataByLetter("C"));
        model.addAttribute("authorsD", authorService.getAuthorsDataByLetter("D"));
        model.addAttribute("authorsE", authorService.getAuthorsDataByLetter("E"));
        model.addAttribute("authorsF", authorService.getAuthorsDataByLetter("F"));
        model.addAttribute("authorsG", authorService.getAuthorsDataByLetter("G"));
        model.addAttribute("authorsH", authorService.getAuthorsDataByLetter("H"));
        model.addAttribute("authorsI", authorService.getAuthorsDataByLetter("I"));
        model.addAttribute("authorsJ", authorService.getAuthorsDataByLetter("J"));
        model.addAttribute("authorsK", authorService.getAuthorsDataByLetter("K"));
        model.addAttribute("authorsL", authorService.getAuthorsDataByLetter("L"));
        model.addAttribute("authorsM", authorService.getAuthorsDataByLetter("M"));
        model.addAttribute("authorsN", authorService.getAuthorsDataByLetter("N"));
        model.addAttribute("authorsO", authorService.getAuthorsDataByLetter("O"));
        model.addAttribute("authorsP", authorService.getAuthorsDataByLetter("P"));
        model.addAttribute("authorsQ", authorService.getAuthorsDataByLetter("Q"));
        model.addAttribute("authorsR", authorService.getAuthorsDataByLetter("R"));
        model.addAttribute("authorsS", authorService.getAuthorsDataByLetter("S"));
        model.addAttribute("authorsT", authorService.getAuthorsDataByLetter("T"));
        model.addAttribute("authorsU", authorService.getAuthorsDataByLetter("U"));
        model.addAttribute("authorsV", authorService.getAuthorsDataByLetter("V"));
        model.addAttribute("authorsW", authorService.getAuthorsDataByLetter("W"));
        model.addAttribute("authorsX", authorService.getAuthorsDataByLetter("X"));
        model.addAttribute("authorsY", authorService.getAuthorsDataByLetter("Y"));
        model.addAttribute("authorsZ", authorService.getAuthorsDataByLetter("Z"));
        return "authors/index";
    }
}
