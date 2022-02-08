package com.app.inventoryapp.controller;

import com.app.inventoryapp.model.Category;
import com.app.inventoryapp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class CategoryController {



    // this code below will go inside the categoryService

    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    //endpoint http://localhost:9092/api/categories/ "get all"
    @GetMapping(path = "/categories/")
    public List<Category> getAllCategories() {
        System.out.println("running getAllCategories");
        return categoryRepository.findAll();
    }

    // once you done that make sure to remove the code above and insert the category service.


    // fix this method getCategoryName --> Write this code inside the CategoryRepository.java

//    @PostMapping("/categories/")
//    public Category createCategory(@RequestBody Category categoryObject) {
//        System.out.println("running createCategory");
//        Category category = categoryRepository.getCategoryName(categoryObject.getCategoryName());//findByName/
//        return categoryRepository.save(categoryObject);
//    }


//    @GetMapping(path = "/categories/")
//    public String getCategories() {
//        return "get all categories";
//    }
//
//    @GetMapping(path = "/categories/{categoryId}")
//    public String getCategory(@PathVariable Long categoryId) {
//        return "getting the category with the id of " + categoryId;
//    }
//
//    @PostMapping("/categories/")
//    public String createCategory(@RequestBody String body) {
//        return "creating a category " + body;
//    }
//
//    @PutMapping("/categories/{categoryId}")
//    public String updateCategory(@PathVariable(value = "categoryId") Long categoryId, @RequestBody String body) {
//        return "updating the category with the id of " + categoryId + body;
//    }
//
//    @DeleteMapping("/categories/{categoryId}")
//    public String deleteCategory(@PathVariable(value = "categoryId") Long categoryId) {
//        return "deleting the category with the id of " + categoryId;
//    }

}


