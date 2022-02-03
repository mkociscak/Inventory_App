package com.app.inventoryapp.controller;

import com.app.inventoryapp.model.Category;
import com.app.inventoryapp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class CategoryController {

/*Category Repo
    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    @GetMapping(path = "/categories/") //endpoint http://localhost:9092/api/categories/ "get all"
    public List<Category> getAllCategories() {
        System.out.println("running getAllCategories");
        return categoryRepository.findAll();
    }
    @PostMapping("/categories/")
    public Category createCategory(@RequestBody Category categoryObject) {
        System.out.println("running createCategory");

        Category category = categoryRepository.getCategoryName(categoryObject.getCategoryName());
        return categoryRepository.save(categoryObject);
    }
//END Category Repo*/

    @GetMapping(path = "/categories/")
    public String getCategories() {
        return "get all categories";
    }


    @GetMapping(path = "/categories/{categoryId}")
    public String getCategory(@PathVariable Long categoryId) {
        return "getting the category with the id of " + categoryId;
    }

    /*@GetMapping(path = "/categories/categoryName")
    public String getCategoryName(@PathVariable String categoryName) {
        return "getting the category with the name of " + categoryName;
    }*/

    @PostMapping("/categories/")
    public String createCategory(@RequestBody String body) {
        return "creating a category " + body;
    }

    @PutMapping("/categories/{categoryId}")
    public String updateCategory(@PathVariable(value = "categoryId") Long categoryId, @RequestBody String body) {
        return "updating the category with the id of " + categoryId + body;
    }

    @DeleteMapping("/categories/{categoryId}")
    public String deleteCategory(@PathVariable(value = "categoryId") Long categoryId) {
        return "deleting the category with the id of " + categoryId;
    }


}


