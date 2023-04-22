package com.istad.minispring.controller;

import com.istad.minispring.model.Article;
import com.istad.minispring.model.articleRequest.ArticleRequest;
import com.istad.minispring.service.ArticleService;
import com.istad.minispring.service.AuthorService;
import com.istad.minispring.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Comparator;
import java.util.stream.Collectors;

@Controller
public class ArticleController {
    ArticleService articleService;
    AuthorService authorService;
    CategoryService categoryService;

    ArticleController(ArticleService articleService,AuthorService authorService,CategoryService categoryService){
        this.articleService=articleService;
        this.authorService= authorService;
        this.categoryService=categoryService;
    }
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("allArticles",articleService.getAllArticle());
        return "index";
    }
    @GetMapping("/author")
    public String articlePage(Model model){
        model.addAttribute("authors",authorService.getAllAuthors());
        return "all-author";
    }
    @GetMapping("/post/{postID}")
    public String getPostByID(@PathVariable int postID,Model model){
       model.addAttribute("article",articleService.getArticleByID(postID));
      return "view-article";
    }
    @GetMapping("/edit/{editID}")
    public String getEditByID(@PathVariable int editID,Model model){
        model.addAttribute("article",articleService.getArticleByID(editID));
        System.out.println("herer is the EditId: "+editID);
      return ("update-article");
    }
    @GetMapping("/update-article")
    public String getFormUpdate(Model model){
        model.addAttribute("article",new ArticleRequest());
        model.addAttribute("authors",authorService.getAllAuthors());
        model.addAttribute("categories",categoryService.getAllCategory());
        return "upadate-article";
    }
    @GetMapping("/handleEditArticle")
    public String handleEditArticle(@ModelAttribute("article") ArticleRequest reqArticle){
        Article newArticle = new Article();
        newArticle.setTitle(reqArticle.getTitle());
        newArticle.setDescription(reqArticle.getDescription());

        newArticle.setAuthor(authorService.getAllAuthors().stream().filter(e->e.getId()==reqArticle.getAuthorID()).findFirst().orElse(null));

        newArticle.setCategory(categoryService.getAllCategory().stream().filter(e->e.getId()==reqArticle.getCategoryID()).findFirst().orElse(null));

//        newArticle.setId(articleService.getAllArticle().);

        articleService.addNewArticle(newArticle);
        return "redirect:/index";
    }

    @GetMapping("/delete/{deleteID}")
    public String getDeleteByID(@PathVariable int deleteID){
        System.out.println("herer is the deleteId: "+deleteID);
        return ("view-article");
    }

    @GetMapping("/add-new-article")
    public String getFormAdd(Model model){
        model.addAttribute("article",new ArticleRequest());
        model.addAttribute("authors",authorService.getAllAuthors());
        model.addAttribute("categories",categoryService.getAllCategory());
        return "new-article";
    }

    @PostMapping("/handleAddArticle")
    public String handleAddArticle(@ModelAttribute("article") ArticleRequest article){
        System.out.println("article "+article);
        Article newArticle = new Article();
        newArticle.setTitle(article.getTitle());
        newArticle.setDescription(article.getDescription());

        newArticle.setAuthor(authorService.getAllAuthors().stream().filter(e->e.getId()==article.getAuthorID()).findFirst().orElse(null));

        newArticle.setCategory(categoryService.getAllCategory().stream().filter(e->e.getId()==article.getCategoryID()).findFirst().orElse(null));

        newArticle.setId(articleService.getAllArticle().stream().max(Comparator.comparingInt(Article::getId)).stream().collect(Collectors.toList()).get(0).getId()+1);

        articleService.addNewArticle(newArticle);
        return "redirect:/index";
    }

    @GetMapping("/profile/{id}/{title}")
    public String getProfile(@PathVariable int id ,@PathVariable String title,Model model){
        model.addAttribute("allPostOfUser",articleService.getArticleByTitle(title));
        model.addAttribute("categories",categoryService.getAllCategory());
        model.addAttribute("authors",authorService.getAuthorByID(id));
        return "profile";
    }


}
