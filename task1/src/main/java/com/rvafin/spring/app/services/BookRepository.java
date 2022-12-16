package com.rvafin.spring.app.services;

import com.rvafin.spring.web.dto.Book;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Repository
public class BookRepository implements ProjectRepository<Book> {

    private final Logger logger = Logger.getLogger(BookRepository.class);
    private final List<Book> repo = new ArrayList();

    public List<Book> retreiveAll() {
        return new ArrayList(repo);
    }

    public void store(Book book) {
        book.setId(book.hashCode());
        logger.info("store new book: " + book);
        repo.add(book);
    }

    public boolean removeItemById(Integer bookIdToRemove) {
        for (Book book : retreiveAll()) {
            if (book.getId().equals(bookIdToRemove)) {
                logger.info("remove book completed: " + book);
                return repo.remove(book);
            }
        }
        return false;
    }

    @Override
    public void removeItemsByAuthor(String author) {
        Pattern pattern = Pattern.compile(author);
        for (Book book : retreiveAll()) {
            Matcher matcher = pattern.matcher(book.getAuthor());
            if (matcher.matches()) {
                repo.remove(book);
            }
        }
    }

    @Override
    public void removeItemsByTitle(String title) {
        Pattern pattern = Pattern.compile(title);
        for (Book book : retreiveAll()) {
            Matcher matcher = pattern.matcher(book.getTitle());
            if (matcher.matches()) {
                repo.remove(book);
            }
        }
    }

    @Override
    public void removeItemsBySize(String size) {
        Pattern pattern = Pattern.compile(size);
        for (Book book : retreiveAll()) {
            Matcher matcher = pattern.matcher(book.getSize().toString());
            if (matcher.matches()) {
                repo.remove(book);
            }
        }
    }


}
