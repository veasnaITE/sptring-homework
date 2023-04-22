package com.istad.minispring.service;

import com.istad.minispring.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category >getAllCategory();
    Category getCategoryByID(int id);
}
