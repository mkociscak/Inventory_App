package com.app.inventoryapp.model;

import javax.persistence.*;

@Entity


public class Category {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String typeName;

    @Column
    private String materials;

    public Category() {
    }

    public Category(Long id, String typeName, String materials) {
        this.id = id;
        this.typeName = typeName;
        this.materials = materials;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
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
                ", typeName='" + typeName + '\'' +
                ", materials='" + materials + '\'' +
                '}';
    }


}
