package com.app.inventoryapp.service;

import com.app.inventoryapp.model.Category;
import com.app.inventoryapp.exceptions.InformationExistException;
import com.app.inventoryapp.exceptions.InformationNotFoundException;
import com.app.inventoryapp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired //(@Qualifier(value = "Category")
    public void setCategoryRepository (CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    //----------------------------------

    //get category
    public List<Category> getAllCategories() {
        List<Category> categoryName = categoryRepository.findAll();
        System.out.println("getting all Categories");
        if (categoryName.isEmpty()) {
            throw new InformationNotFoundException("no matching category found");
        } else {
            return categoryRepository.findAll();
        }
    }

    public Optional<Category> getCategory(Long categoryId) {
        Optional<Category> category = categoryRepository.findById(categoryId);
        System.out.println("getting one Category ==>");
        if (category.isPresent()) {
            return category; //categoryId ?
        } else {
            throw new InformationNotFoundException("category with id " + categoryId + " not found");
        }
    }

    public Optional<Category> getCategoryName(String categoryName) {
        Optional<Category> category = Optional.ofNullable(categoryRepository.findByCategoryName(categoryName));
        System.out.println("getting one Category ==>");
        if (category.isPresent()) {
            return category; //categoryId ?
        } else {
            throw new InformationNotFoundException("Category with name " + categoryName + " not found");
        }
    }

    //create new category
    public Category createCategory(Category categoryObject) {
        System.out.println("service running createCategory ==>");
        Category category = categoryRepository.findByCategoryName(categoryObject.getCategoryName());
        if (category != null) {
            throw new InformationExistException("category with name " + category.getCategoryName() + " already exists");
        } else {
            return categoryRepository.save(categoryObject);
        }
    }

    //delete category
    public Optional<Category> deleteCategory(Long categoryId) {
        System.out.println("service calling deleteCategory ==>");
        Optional<Category> category = categoryRepository.findById(categoryId);
        if (category.isPresent()) {
            categoryRepository.deleteById(categoryId);
            return category;
        } else {
            throw new InformationNotFoundException("category with id " + categoryId + " not found");
        }

    }


}




//public List<Category> getAllCategories() {
//        System.out.println("running getAllCategories ==>");
//        return categoryRepository.getAllCategories(String categoryName);
//    }
//    public Category updateCategory(Long categoryId, Category categoryObject) {
//        System.out.println("service calling updateCategory ==>");
//        Optional<Category> category = categoryRepository.findById(categoryId);
//        if (category.isPresent()) {
//            if (categoryObject.getCategoryName().equals(category.get().getCategoryName())) {
//                throw new InformationExistException("category " + category.get().getCategoryName() + " is already exists");
//            } else {
//                Category updateCategory = categoryRepository.findById(categoryId).get();
//                updateCategory.setCategoryName(categoryObject.getCategoryName());
//                updateCategory.setMaterials(categoryObject.getMaterials());
//                return categoryRepository.save(updateCategory);
//            }
//        } else {
//            throw new InformationNotFoundException("category with id " + categoryId + " not found");
//        }
//    }
//
//
//    }
//
//
//

