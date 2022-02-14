package com.app.inventoryapp.model;
//getters & setters for tables

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long categoryId;

    @Column
    private String categoryName;  //CategoryName categoryName

    @Column
    private String materials;



    public Category() {
    }

    public Category(Long categoryId, String categoryName, String materials) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.materials = materials;
    }

    @OneToMany//(mappedBy = "Category", orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "artistName")
    private List<Artist> artist;



    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", materials='" + materials + '\'' +
                '}';
    }
}


    // one category can contain one location
    //@OneToOne(mappedBy = "category", orphanRemoval = true)
    //@LazyCollection(LazyCollectionOption.FALSE)

