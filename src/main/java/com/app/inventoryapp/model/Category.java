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
    private Long id;

    @Column
    private String categoryName;  //CategoryName categoryName

    @Column
    private String materials;


    @OneToMany
    @JoinColumn(name = "Artist")
    private List<Artist> artist;


    public Category() {
    }

    public Category(Long id, String categoryName, String materials, String artist) {
        this.id = id;
        this.categoryName = categoryName;
        this.materials = materials;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", materials='" + materials + '\'' +
                '}';
    }
}

    // one category can contain one location
    //@OneToOne(mappedBy = "category", orphanRemoval = true)
    //@LazyCollection(LazyCollectionOption.FALSE)

