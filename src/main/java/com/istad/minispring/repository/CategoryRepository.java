package com.istad.minispring.repository;

import com.istad.minispring.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {
    private List<Category> categories = new ArrayList<>(){
        {
            add(new Category(1002,"Science","scient is never lie to you"));
            add(new Category(1003,"Technology","Technology Bring the world Together"));
            add(new Category(1004,"Books","Books Tell You Every thing About the social"));
            add(new Category(1005,"Entertainment","Entertainment make you stay Stronger "));
            add(new Category(1006,"ScholarShip","There the the new world for student"));
            add(new Category(1007,"News","Uptodate news from the world"));
        }
    };
    public List<Category>getAllCategory(){
        return categories;
    }
    public Category getCategoryByID(int id){
        return  categories.stream().filter(e->e.getId()==id).findFirst().orElse(null);
    }
}
