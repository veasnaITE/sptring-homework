package com.istad.minispring.service;

import com.istad.minispring.model.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAllAuthors();
    Author getAuthorByID(int id);
}
