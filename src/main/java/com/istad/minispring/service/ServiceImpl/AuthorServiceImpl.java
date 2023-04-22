package com.istad.minispring.service.ServiceImpl;

import com.istad.minispring.model.Author;
import com.istad.minispring.repository.AuthorRepository;
import com.istad.minispring.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorServiceImpl implements AuthorService {
    AuthorRepository authorRepository;
    AuthorServiceImpl(){
        authorRepository= new AuthorRepository();
    }
    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.getAllAuthor();
    }

    @Override
    public Author getAuthorByID(int id) {
        return authorRepository.getAuthorByID(id);
    }

}
