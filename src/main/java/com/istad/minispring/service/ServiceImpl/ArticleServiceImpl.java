package com.istad.minispring.service.ServiceImpl;

import com.istad.minispring.model.Article;
import com.istad.minispring.repository.ArticleRepository;
import com.istad.minispring.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {
    ArticleRepository articleRepository;
    ArticleServiceImpl(){
        articleRepository= new ArticleRepository();
    }

    @Override
    public List<Article> getAllArticle() {
        return articleRepository.getAllArticle();
    }

    @Override
    public Article getArticleByID(int id) {
        return articleRepository.getArticleByID(id);
    }

    @Override
    public void addNewArticle(Article article) {
        articleRepository.addNewArticle(article);
    }

    @Override
    public List<Article> getArticleByAuthorName(String name) {
        return articleRepository.getArticleByAuthorName(name);
    }

}
