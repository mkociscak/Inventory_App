package com.app.inventoryapp.model;
//getters & setters for tables

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String categoryName;

    @Column
    private String materials;


    public Category() {
    }

    // one category can contain more than one recipe
    @OneToMany(mappedBy = "category", orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Location> locationList;


    public Category(Long id, String categoryName, String materials) {
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
    public List<Location> getLocationList() {
        return locationList;
    }

    public void setLocationList(List<Location> locationList) {
        this.locationList = locationList;
    }

}
