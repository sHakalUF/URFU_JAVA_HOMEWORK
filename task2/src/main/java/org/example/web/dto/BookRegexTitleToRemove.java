package org.example.web.dto;

import javax.validation.constraints.NotBlank;

public class BookRegexTitleToRemove {
    @NotBlank
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
