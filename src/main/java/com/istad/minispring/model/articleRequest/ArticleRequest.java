package com.istad.minispring.model.articleRequest;

import com.istad.minispring.model.Author;
import com.istad.minispring.model.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleRequest {
    private String title;
    private String description;
    private String ImageUrl;
    private int authorID;
    private int categoryID;
}
