package org.example.assignmentproject.controller;

import org.example.assignmentproject.dto.CategoryDto;
import org.example.assignmentproject.model.Category;
import org.example.assignmentproject.model.Result;
import org.example.assignmentproject.servise.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping
    public List<Category> getAllCategories() {
        List<Category> all = categoryService.findAll();
        return all;
    }
    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Integer id) {
        Category categoryById= categoryService.findById(id);
        return categoryById;
    }
    @PostMapping
    public Result createCategory(@RequestBody CategoryDto categoryDto) {
        Result result = categoryService.create(categoryDto);
        return result;
    }
    @PutMapping("/{id}")
    public Result updateCategory(@PathVariable Integer id, @RequestBody CategoryDto categoryDto) {
        Result result = categoryService.update(id, categoryDto);
        return result;
    }
    @DeleteMapping("/{id}")
    public Result deleteCategory(@PathVariable Integer id) {
        Result result = categoryService.delete(id);
        return result;
    }


}
