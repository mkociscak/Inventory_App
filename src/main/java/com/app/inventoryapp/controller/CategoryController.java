package com.app.inventoryapp.controller;

import com.app.inventoryapp.model.Category;
import com.app.inventoryapp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping(path = "/categories/{categoryId}")
    public Optional getCategory(@PathVariable Long categoryId) {
        System.out.println("running getOneCategory");
        return categoryService.getCategory(categoryId);
    }



    @PostMapping("/categories/")
    public Category createCategory(@RequestBody Category categoryObject) {
        System.out.println("running createOneCategory");
        return categoryService.createCategory(categoryObject);
    }
}




// fix this method getCategoryName --> Write this code inside the CategoryRepository.java


   /* @DeleteMapping("/categories/{categoryId}")
    public Optional deleteCategory(@PathVariable(value = "categoryId") Long categoryId) {
        System.out.println("deleting the category with the id of " + categoryId);
        return categoryService.deleteCategory(categoryId);
    }

  //endpoint http://localhost:9092/api/categories/ "get all"
    @GetMapping(path = "/categories/")
    public List<Category> getAllCategories() {
        System.out.println("running getAllCategories");
        return categoryService.getAllCategories();
    }*/

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
//




