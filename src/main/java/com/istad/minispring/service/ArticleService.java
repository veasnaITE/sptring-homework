package com.istad.minispring.service;

import com.istad.minispring.model.Article;

import java.util.List;

public interface ArticleService {
    List<Article>getAllArticle();
    Article getArticleByID(int id );

    void addNewArticle(Article article);
    List<Article>getArticleByAuthorName(String name);
}
