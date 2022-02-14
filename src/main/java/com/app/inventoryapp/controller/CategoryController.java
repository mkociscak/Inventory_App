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

    //endpoint http://localhost:9092/api/category/ "get all"
    @GetMapping(path = "/category/")
    public List<Category> getAllCategories() {
        System.out.println("getting all Categories");
        return categoryService.getAllCategories();
    }

    @PostMapping("/category/")
    public Category createCategory(@RequestBody Category categoryObject) {
        System.out.println("create a new Category");
        return categoryService.createCategory(categoryObject);
    }

}




// fix this method getCategoryName --> Write this code inside the CategoryRepository.java


   /*

@GetMapping(path = "/category/{categoryId}")
        public String Category getCategory(@PathVariable("id") Long categoryId) {
            System.out.println("getting one Category");
            return categoryService.getCategory();
        }

@DeleteMapping("/categories/{categoryId}")
    public Optional deleteCategory(@PathVariable(value = "categoryId") Long categoryId) {
        System.out.println("deleting the category with the id of " + categoryId);
        return categoryService.deleteCategory(categoryId);
    }


@GetMapping("/category/{id}")
            public ResponseEntity<Category> getCategory(@PathVariable("id") Long categoryId) {
                Category category = userService.findUserById(id);
                return new ResponseEntity<>(user, HttpStatus.OK);
            }

        @PostMapping("/add")
            public ResponseEntity<User> addUser(@RequestBody User user) {
                User newUser = userService.addUser(user);
                return new ResponseEntity<>(newUser, HttpStatus.CREATED);
            }




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




