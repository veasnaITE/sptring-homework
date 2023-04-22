package com.istad.minispring.repository;

import com.istad.minispring.model.Article;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class ArticleRepository {
    private List<Article> articleList = new ArrayList<>(){{
        add(new Article(1,"Chat GPT4","it is the most powerfull feature in the technology world ","https://cdn.pixabay.com/photo/2014/02/27/16/10/flowers-276014_960_720.jpg",new AuthorRepository().getAllAuthor().get(2),new CategoryRepository().getAllCategory().get(1)));
        add(new Article(2,"Chat GPT4","it is the most powerfull feature in the technology world ","https://cdn.pixabay.com/photo/2012/03/01/00/55/flowers-19830_960_720.jpg",new AuthorRepository().getAllAuthor().get(1),new CategoryRepository().getAllCategory().get(3)));
        add(new Article(3,"Chat GPT4","it is the most powerfull feature in the technology world ","https://cdn.pixabay.com/photo/2013/07/21/13/00/rose-165819_960_720.jpg",new AuthorRepository().getAllAuthor().get(0),new CategoryRepository().getAllCategory().get(0)));
        add(new Article(4,"Chat GPT4","it is the most powerfull feature in the technology world ","https://cdn.pixabay.com/photo/2016/06/03/13/57/digital-marketing-1433427_960_720.jpg",new AuthorRepository().getAllAuthor().get(0),new CategoryRepository().getAllCategory().get(2)));
        add(new Article(5,"Chat GPT4","it is the most powerfull feature in the technology world ","https://cdn.pixabay.com/photo/2017/04/23/19/30/earth-2254769_960_720.jpg",new AuthorRepository().getAllAuthor().get(3),new CategoryRepository().getAllCategory().get(3)));
        add(new Article(6,"Chat GPT4","it is the most powerfull feature in the technology world ","https://cdn.pixabay.com/photo/2017/12/10/17/00/robot-3010309_960_720.jpg",new AuthorRepository().getAllAuthor().get(1),new CategoryRepository().getAllCategory().get(4)));
    }};
    public List<Article> getAllArticle(){
        return articleList;
    }
    public Article getArticleByID(int id){
        return articleList.stream().filter(e->e.getId()==id).findFirst().orElse(null);
    }
    public void addNewArticle(Article article){
        articleList.add(article);
    }

    public List<Article> getArticleByAuthorName(String name){
        return articleList.stream().filter(e-> Objects.equals(e.getAuthor().getName(), name)).toList();
    }
}
