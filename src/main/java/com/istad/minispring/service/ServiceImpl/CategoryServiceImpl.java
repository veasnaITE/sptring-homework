package com.istad.minispring.service.ServiceImpl;
import com.istad.minispring.model.Category;
import com.istad.minispring.repository.CategoryRepository;
import com.istad.minispring.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    CategoryRepository categoryRepository;
    CategoryServiceImpl(){
        categoryRepository= new CategoryRepository();
    }
    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.getAllCategory();
    }

    @Override
    public Category getCategoryByID(int id) {
        return categoryRepository.getCategoryByID(id);
    }
}
