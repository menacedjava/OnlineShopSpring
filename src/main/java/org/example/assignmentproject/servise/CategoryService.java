package org.example.assignmentproject.servise;

import org.example.assignmentproject.dto.CategoryDto;
import org.example.assignmentproject.model.Category;
import org.example.assignmentproject.model.Result;
import org.example.assignmentproject.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
    public Optional<Category> findById(Integer id) {
        return categoryRepository.findById(id);

    }
    public Category create(Category category) {
        Category category1 = new Category();
        category1.setName(category.getName());
        category1.setDescription(category.getDescription());
        return categoryRepository.save(category1);
    }
    public Result update(Integer id , CategoryDto categoryDto) {
        if (categoryRepository.findById(id).isPresent()) {
            Category category1 = categoryRepository.findById(id).get();
            categoryRepository.set

        }


    }

}
