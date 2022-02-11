package com.app.inventoryapp.repository;

import com.app.inventoryapp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

@Qualifier(value="Category")        
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByCategoryName(String categoryName);

}

//Category getCategory()
//List<Category> getAllCategories(String categoryName);