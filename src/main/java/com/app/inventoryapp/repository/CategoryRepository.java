package com.app.inventoryapp.repository;

import com.app.inventoryapp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    //Category findByName(String categoryName); //findByName/getCategoryName
}
