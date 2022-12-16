package org.example.web.dto;

import javax.validation.constraints.NotBlank;

public class BookRegexAuthorToRemove {
    @NotBlank
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
