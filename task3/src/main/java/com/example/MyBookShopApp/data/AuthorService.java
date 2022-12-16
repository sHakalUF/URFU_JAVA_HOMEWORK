package com.example.MyBookShopApp.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public AuthorService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Author> getAuthorsDataByLetter(String letter) {

        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors where name LIKE ?", new String[]{letter + "%"}, (ResultSet rs, int rownum) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        });
        return new ArrayList<>(authors);
    }

    public List<Author> getAuthor(Integer id) {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors where id=?", new Object[]{id}, (ResultSet rs, int rownum) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        });
        return new ArrayList<>(authors);
    }
}
