package com.istad.minispring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    private int id;
    private String title;
    private String description;
    private String ImageUrl;
    private Author author;
    private Category category;
}
