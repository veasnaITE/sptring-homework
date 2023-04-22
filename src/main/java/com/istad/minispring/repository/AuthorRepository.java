package com.istad.minispring.repository;

import com.istad.minispring.model.Article;
import com.istad.minispring.model.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class AuthorRepository {
    private List<Author> authors = new ArrayList<>(){
        {
            add(new Author(101,"Jame","@jame.edu","male","jame@gmail.edu.com","nobody is perfect","https://cdn.pixabay.com/photo/2015/07/09/00/29/woman-837156_960_720.jpg","https://cdn.pixabay.com/photo/2014/12/16/22/25/woman-570883_960_720.jpg"));
            add(new Author(103,"Dum day","@dumday.edu","female","dumday@gmail.edu.com","there isn't love in the world","https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_960_720.jpg","https://cdn.pixabay.com/photo/2014/09/03/20/15/shoes-434918_960_720.jpg"));
            add(new Author(104,"Deni yin","@deniyin.edu","female","deniyin@gmail.edu.com","do not become the perfect one","https://cdn.pixabay.com/photo/2016/10/16/13/44/young-woman-1745173_960_720.jpg","https://cdn.pixabay.com/photo/2013/02/21/19/06/drink-84533_960_720.jpg"));
            add(new Author(105,"Davli duce","@davliduce.edu","male","daliduce@gmail.edu.com","know is everything","https://cdn.pixabay.com/photo/2015/08/13/17/24/vintage-1950s-887272_960_720.jpg","https://cdn.pixabay.com/photo/2014/08/15/11/29/beach-418742_960_720.jpg"));
        }
    };
    public List<Author> getAllAuthor(){
        return authors;
    }
    public Author getAuthorByID(int id){return authors.stream().filter(e->e.getId()==id).findFirst().orElse(null);}
}
