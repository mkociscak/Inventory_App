package com.app.inventoryapp.service;
//import com.app.inventoryapp.exceptions.InformationExistException;
//import com.app.inventoryapp.exceptions.InformationNotFoundException;
import com.app.inventoryapp.exceptions.InformationExistException;
import com.app.inventoryapp.exceptions.InformationNotFoundException;
import com.app.inventoryapp.model.Category;
import com.app.inventoryapp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import javax.persistence.*;
import java.util.List;
import java.util.Optional;


@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(@Qualifier(value = "Category") CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    public Optional getCategory(Long categoryId) {
        System.out.println("service getCategory ==>");
        Optional category = categoryRepository.findById(categoryId);
        if (category.isPresent()) {
            return category;
        } else {
            throw new InformationNotFoundException("category with id " + categoryId + " not found");
        }
    }

    public Category createCategory(Category categoryObject) {
        System.out.println("service running createCategory ==>");
        Category category = categoryRepository.findByCategoryName(categoryObject.getCategoryName());
        if (category != null) {
            throw new InformationExistException("category with name " + category.getCategoryName() + " already exists");
        } else {
            return categoryRepository.save(categoryObject);
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
//    public Optional<Category> deleteCategory(Long categoryId) {
//        System.out.println("service calling deleteCategory ==>");
//        Optional<Category> category = categoryRepository.findById(categoryId);
//        if (category.isPresent()) {
//            categoryRepository.deleteById(categoryId);
//            return category;
//        } else {
//            throw new InformationNotFoundException("category with id " + categoryId + " not found");
//        }
//    }
//
//
//

